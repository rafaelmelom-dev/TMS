package ManStr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ManStrTest {

    @Test
    public void testInverter() {
        assertEquals("ovoN", ManStr.inverter("Novo"));
    }

    @Test
    public void testInverterEspec() {
        assertEquals("$ovoN", ManStr.inverter("Novo$"));
    }

    @Test
    public void testInverterVazio() {
        assertEquals("", ManStr.inverter(""));
    }

    @Test
    public void testContador() {
        assertEquals(0, ManStr.contarChar("Novo", 'a'));
    }

    @Test
    public void testContadorCon() {
        assertEquals(2, ManStr.contarChar("Novo", 'o'));
    }

    @Test
    public void testContadorVazio() {
        assertEquals(0, ManStr.contarChar("", 'b'));
    }

    @Test
    public void testPalindromo() {
        assertFalse(ManStr.palindromo("novo"));
    }

    @Test
    public void testPalindromoTrue() {
        assertTrue(ManStr.palindromo("ovo"));
    }

    @Test
    public void testPalindromoVazio() {
        assertTrue(ManStr.palindromo(""));
    }

    @Test
    public void testMaiusculas() {
        assertEquals("NOVO", ManStr.maiusculas("Novo"));
    }

    @Test
    public void testMaiusculasVazio() {
        assertEquals("", ManStr.maiusculas(""));
    }

    @Test
    public void testMinusculas() {
        assertEquals("novo", ManStr.minusculas("Novo"));
    }

    @Test
    public void testMinusculasVazio() {
        assertEquals("", ManStr.minusculas(""));
    }
}
