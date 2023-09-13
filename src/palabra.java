import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class palabra {
    public static String determinarTipoDato(String entrada) {
        char primerCaracter = entrada.charAt(0);

        if (Character.isDigit(primerCaracter)) {
            return "Number";
        } else if (Character.isUpperCase(primerCaracter)) {
            return "Mayus";
        } else if (Character.isLowerCase(primerCaracter)) {
            return "Minus";
        } else {
            return "Other";
        }
    }
    @Nested
    class OperationsTest {
        @Test
        public void testDeterminarTipoDato() {
            assertEquals("Number", palabra.determinarTipoDato("12 street"));
            assertEquals("Mayus", palabra.determinarTipoDato("Hola"));
            assertEquals("Minus", palabra.determinarTipoDato("crayoli"));
            assertEquals("Other", palabra.determinarTipoDato("#ch30"));
        }
    }
}
