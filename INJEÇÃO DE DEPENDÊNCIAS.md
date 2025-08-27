# Atividade 

1. Crie uma classe de teste que valide os métodos da classe Usuário considerando: 
	1. Campos do tipo String não podem ser nulos ou vazios;
	2. Nome não pode conter caracteres especiais ou números, sendo permitido apenas espaço entre as palavras;
	3. E-mail deve estar no seguinte padrão usuario@dominio;
	4. usuario pode conter apenas caracteres alfanuméricos não acentuados, ponto(.) ou sublinhado;
	5. dominio pode conter apenas caracteres alfanuméricos.
2. Complete o código de Usuário para fornecer os métodos pendentes (ex. get/set) e as funcionalidades de validação a serem usadas na classe de teste (ex. validarNome).
3. A autenticação sem sucesso deve ser permitida por até três vezes dentro de 30 segundos, devendo lançar  exceção do tipo "ExceededAttemptsException" se 4 ou mais tentativas forem realizadas em menos de 30 segundos, neste caso, novas tentativas deverão ser permitidas apenas depois de uma espera de um minuto.
4. Adapte o código para que essa funcionalidade seja devidamente implementada. 
5. Utilize as classes TestInfo, TestReporter e RepetitionInfo para tornar mais claro os resultados do testes, em especial se houver falhas.

---
## Código de exemplo  

``` java 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 
import java.util.Base64; 

public class Usuario { 

    private String nome; 
    private String email; 
    private String senhaHash; 

// get/set com validação de atributos 

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

    public boolean autenticar(String senha) { 

        try { 
            MessageDigest digest = MessageDigest.getInstance("SHA-256"); 
            byte[] hashBytes = digest.digest(senha.getBytes()); 
            String hashString = Base64.getEncoder().encodeToString(hashBytes); 
            return hashString.equals(this.senhaHash); 
        } catch (NoSuchAlgorithmException e) { 
            return false; 
        } 
    } 
}
```

