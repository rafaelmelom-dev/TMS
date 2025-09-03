package ParametrizedTest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Usuario {

    private Long timeInicio;
    private Integer tentativas = 0;
    private Boolean bloqueado;

    private String nome;

    private String email;

    private String senhaHash;

    // get/set com validação de atributos

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.length() == 0) {
            throw new Exception("Nome inválido");
        }

        for (int i = 0; i < nome.length(); i++) {
            if (!Character.isLetter(nome.charAt(i))) {
                throw new Exception("Nome inválido");
            }
        }

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) throws Exception {
        if (email == null || email.length() == 0) {
            throw new Exception("E-mail inválido!");
        }

        String usuario;
        String dominio;

        Integer pos = email.indexOf("@");

        if (pos == -1) {
            throw new Exception("E-mail inválido!");
        }

        usuario = email.substring(0, pos);
        dominio = email.substring(pos + 1);

        if (usuario.length() == 0) {
            throw new Exception("Usuário inválido!");
        }

        if (dominio.length() == 0) {
            throw new Exception("Domínio inválido!");
        }

        for (int i = 0; i < usuario.length(); i++) {
            Character letra = usuario.charAt(i);

            if (!Character.isLetter(letra) && letra != '.' && letra != '_') {
                throw new Exception("Usuário inválido!");
            }
        }

        for (int i = 0; i < dominio.length(); i++) {
            if (!Character.isLetter(dominio.charAt(i))) {
                throw new Exception("Domínio inválido!");
            }
        }

        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = digest.digest(senha.getBytes());

            String hashString = Base64.getEncoder().encodeToString(hashBytes);

            this.senhaHash = hashString;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Algoritmo de hash não encontrado", e);
        }
    }

    public boolean autenticar(String senha, String algoritmo)
        throws ExceededAttemptsException, NoSuchAlgorithmException {
        String algoritmoUsado = "SHA-256";

        if (algoritmo != algoritmoUsado) {
            throw new NoSuchAlgorithmException("Algoritmo de hash não usado");
        }

        if (tentativas == 0) {
            timeInicio = System.currentTimeMillis();
        }

        Long time = System.currentTimeMillis();
        Long limite = 30000L;
        Long tempoBloqueado = 60000L;

        // bloqueio
        if (bloqueado) {
            if (time - timeInicio > tempoBloqueado) {
                bloqueado = false;
                tentativas = 0;
                timeInicio = time;
            } else {
                throw new ExceededAttemptsException(
                    "Número máximo de tentativas excedido"
                );
            }
        } else {
            tentativas++;

            if (tentativas > 3 && time - timeInicio > limite) {
                bloqueado = true;

                throw new ExceededAttemptsException(
                    "Número máximo de tentativas excedido"
                );
            }
        }

        try {
            MessageDigest digest = MessageDigest.getInstance(algoritmo);

            byte[] hashBytes = digest.digest(senha.getBytes());

            String hashString = Base64.getEncoder().encodeToString(hashBytes);

            return hashString.equals(this.senhaHash);
        } catch (NoSuchAlgorithmException e) {
            throw new NoSuchAlgorithmException(
                "Algoritmo de hash não encontrado",
                e
            );
        }
    }
}
