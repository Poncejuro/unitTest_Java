import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class palindromo {
    public static boolean esCasiPalindromo(String palabra) {
        palabra = palabra.replaceAll("\\s", "").toLowerCase();
        int cambios = 0;
        for (int i = 0, j = palabra.length() - 1; i < j; i++, j--) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                cambios++;
                if (cambios > 1) {
                    return false;
                }
            }
        }
        return cambios == 1;
    }
    @Nested
    class OperationsTest {
        @Test
        public void testEsCasiPalindromo() {
            assertFalse(esCasiPalindromo("Oso"));
            assertTrue(esCasiPalindromo("Ver"));
            assertFalse(esCasiPalindromo("Hola"));
            assertTrue(esCasiPalindromo("Ocho"));
            assertFalse(esCasiPalindromo("Veronica"));
            assertTrue(esCasiPalindromo("Anita lavó la tina"));
        }
    }
}


