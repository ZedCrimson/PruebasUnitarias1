package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    @Test
    @DisplayName("Test 1.Nombre en blanco")
    public void testNombreVacio() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    @Test
    @DisplayName("Test 2.Password de exactamente 8 caracteres")
    public void testContraseñaExacta() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.contrasena8("12345678");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    @Test
    @DisplayName("Test 3.Password de exactamente 5 caracteres y de erroneo")
    public void testContraseña5fallo() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.contrasena5("12345");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertFalse(resultado, "Error: El sistema rechazó la contraseña introducida");
    }

    @Test
    @DisplayName("Test 4.Correo erroneo")
    public void testCorreoErroneo() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.emailfalso("x.y.com");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó el correo introducido");
    }

    @Test
    @DisplayName("Test 5.Aceptar 16 años")
    public void testEdadMinima() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.EdadMinima(16);

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

}
