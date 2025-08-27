package InjDep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UsuarioTest {

    // teste do set do usuário
    @Test
    public void testUsuario() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("abcd");

            assertEquals("abcd", usuario.getNome());
        } catch (Exception e) {}
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

    @Test
    public void testUsuarioVazio() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("");
        } catch (Exception e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    public void testUsuarioEspaco() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("abcd efg");

            assertEquals("abcd efg", usuario.getNome());
        } catch (Exception e) {}
    }

    @Test
    public void testUsuarioEspeciais() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("abcd@");
        } catch (Exception e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    public void testUsuarioNumeros() {
        Usuario usuario = new Usuario();

        try {
            usuario.setNome("abcd123");
        } catch (Exception e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    // teste do set email
    @Test
    public void testEmail() {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail("teste@testedominio");

            assertEquals("teste@testedominio", usuario.getEmail());
        } catch (Exception e) {}
    }

    @Test
    public void testEmailVariado() {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail("teste123._@testedominio123");

            assertEquals("teste@testedominio", usuario.getEmail());
        } catch (Exception e) {}
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

    @Test
    public void testEmailUsuarioVazio() {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail("@testedominio");
        } catch (Exception e) {
            assertEquals("Usuário inválido!", e.getMessage());
        }
    }

    @Test
    public void testEmailDominioVazio() {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail("teste@");
        } catch (Exception e) {
            assertEquals("Domínio inválido!", e.getMessage());
        }
    }

    @Test
    public void testEmailUsuarioInvalido() {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail("teste$@testedominio");
        } catch (Exception e) {
            assertEquals("Usuário inválido!", e.getMessage());
        }
    }

    @Test
    public void testEmailDominioInvalido() {
        Usuario usuario = new Usuario();

        try {
            usuario.setEmail("teste@testedominio.");
        } catch (Exception e) {
            assertEquals("Domínio inválido", e.getMessage());
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
