package ParametrizedTest;

import static org.junit.jupiter.api.Assertions.*;

import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class UsuarioTest {

    // teste do set do usuário
    @ParameterizedTest
    @ValueSource(strings = { "abcd", "abcd efg" })
    public void testUsuario(String nomeUsuario) {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome(nomeUsuario);

            assertEquals(nomeUsuario, usuario.getNome());
        } catch (Exception e) {}
    }

    @ParameterizedTest
    @ValueSource(strings = { "", "abcd@", "abcd123" })
    public void testUsuarioErro(String nomeUsuario) {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome(nomeUsuario);
        } catch (Exception e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    public void testUsuarioNulos() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome(null);
        } catch (Exception e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    // teste do set email
    @ParameterizedTest
    @ValueSource(
        strings = { "teste@testedominio", "teste123._@testedominio123" }
    )
    public void testEmail(String email) {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail(email);

            assertEquals(email, usuario.getEmail());
        } catch (Exception e) {}
    }

    @ParameterizedTest
    @ValueSource(strings = { "@testedominio", "teste$@testedominio" })
    public void testEmailUsuarioInvalido(String email) {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail(email);
        } catch (Exception e) {
            assertEquals("Usuário inválido!", e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "teste@", "teste@testedominio." })
    public void testEmailDominioInvalido(String email) {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail(email);
        } catch (Exception e) {
            assertEquals("Domínio inválido!", e.getMessage());
        }
    }

    @Test
    public void testEmailVazio() {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail("");
        } catch (Exception e) {
            assertEquals("E-mail inválido!", e.getMessage());
        }
    }

    @Test
    public void testEmailNulo() {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail(null);
        } catch (Exception e) {
            assertEquals("E-mail inválido!", e.getMessage());
        }
    }

    // teste de autenticação de senha
    @Test
    public void testAutenticar() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("usuario");
            usuario.setSenha("senha");

            assertTrue(usuario.autenticar("senha", "SHA-256"));
        } catch (Exception e) {}
    }

    @Test
    public void testAutenticarTempoPermitido() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("usuario");
            usuario.setSenha("senha");

            usuario.autenticar("senhas", "SHA-256");
            usuario.autenticar("senhas", "SHA-256");

            assertTrue(usuario.autenticar("senha", "SHA-256"));
        } catch (Exception e) {}
    }

    @Test
    public void testAutenticarTempoNaoPermitido() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("usuario");
            usuario.setSenha("senha");

            usuario.autenticar("senhas", "SHA-256");
            usuario.autenticar("senhas", "SHA-256");
            usuario.autenticar("senhas", "SHA-256");
        } catch (ExceededAttemptsException e) {
            assertThrows(ExceededAttemptsException.class, () ->
                usuario.autenticar("senha", "SHA-256")
            );
        } catch (Exception e) {}
    }

    @Test
    public void testAutenticarEsperando() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("usuario");
            usuario.setSenha("senha");

            usuario.autenticar("senhas", "SHA-256");
            usuario.autenticar("senhas", "SHA-256");

            Thread.sleep(30000);

            usuario.autenticar("senhas", "SHA-256");
            usuario.autenticar("senhas", "SHA-256");

            assertTrue(usuario.autenticar("senha", "SHA-256"));
        } catch (ExceededAttemptsException e) {} catch (Exception e) {}
    }

    @Test
    public void testAutenticarBloqueado() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("usuario");
            usuario.setSenha("senha");

            usuario.autenticar("senhas", "SHA-256");
            usuario.autenticar("senhas", "SHA-256");
            usuario.autenticar("senhas", "SHA-256");

            fail("Deveria ter lançado ExceededAttemptsException");
        } catch (ExceededAttemptsException e) {
            try {
                Thread.sleep(60000);

                try {
                    assertTrue(usuario.autenticar("senha", "SHA-256"));
                } catch (ExceededAttemptsException exp) {
                    fail("Deveria ter lançado ExceededAttemptsException");
                } catch (Exception ex) {}
            } catch (InterruptedException ex) {}
        } catch (Exception e) {}
    }

    // teste de sobrecarga
    @ParameterizedTest
    @CsvSource({ "senha, SHA-1", "senha, SHA-512", "senha, MD5" })
    public void testAutenticarSobrecarga(String senha, String algoritmo) {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("usuario");
            usuario.setSenha(senha);

            assertThrows(NoSuchAlgorithmException.class, () ->
                usuario.autenticar(senha, algoritmo)
            );
        } catch (Exception e) {}
    }
}
