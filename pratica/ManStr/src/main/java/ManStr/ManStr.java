package ManStr;

public class ManStr {

    public static String inverter(String texto) {
        String novo_texto = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            novo_texto += texto.charAt(i);
        }

        return novo_texto;
    }

    public static Integer contarChar(String texto, Character ch) {
        Integer contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ch) {
                contador++;
            }
        }

        return contador;
    }

    public static Boolean palindromo(String texto) {
        if (inverter(texto).equals(texto)) {
            return true;
        }

        return false;
    }

    public static String maiusculas(String texto) {
        return texto.toUpperCase();
    }

    public static String minusculas(String texto) {
        return texto.toLowerCase();
    }
}
