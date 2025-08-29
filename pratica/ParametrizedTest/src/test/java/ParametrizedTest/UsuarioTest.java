package ParametrizedTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
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

            assertTrue(usuario.autenticar("senha"));
        } catch (Exception e) {}
    }

    @Test
    public void testAutenticarTempoPermitido() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("usuario");
            usuario.setSenha("senha");

            usuario.autenticar("senhas");
            usuario.autenticar("senhas");

            assertTrue(usuario.autenticar("senha"));
        } catch (Exception e) {}
    }

    @Test
    public void testAutenticarTempoNaoPermitido() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("usuario");
            usuario.setSenha("senha");

            usuario.autenticar("senhas");
            usuario.autenticar("senhas");
            usuario.autenticar("senhas");
        } catch (ExceededAttemptsException e) {
            assertThrows(ExceededAttemptsException.class, () ->
                usuario.autenticar("senha")
            );
        } catch (Exception e) {}
    }

    @Test
    public void testAutenticarEsperando() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("usuario");
            usuario.setSenha("senha");

            usuario.autenticar("senhas");
            usuario.autenticar("senhas");

            Thread.sleep(30000);

            usuario.autenticar("senhas");
            usuario.autenticar("senhas");

            assertTrue(usuario.autenticar("senha"));
        } catch (ExceededAttemptsException e) {} catch (Exception e) {}
    }

    @Test
    public void testAutenticarBloqueado() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("usuario");
            usuario.setSenha("senha");

            usuario.autenticar("senhas");
            usuario.autenticar("senhas");
            usuario.autenticar("senhas");

            fail("Deveria ter lançado ExceededAttemptsException");
        } catch (ExceededAttemptsException e) {
            try {
                Thread.sleep(60000);

                try {
                    assertTrue(usuario.autenticar("senha"));
                } catch (ExceededAttemptsException exp) {
                    fail("Deveria ter lançado ExceededAttemptsException");
                }
            } catch (InterruptedException ex) {}
        } catch (Exception e) {}
    }
}
