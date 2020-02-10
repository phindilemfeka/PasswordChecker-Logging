
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LoggingTest {

        @Test
        void PasswordIsValidTest() {
            Logging pass = new Logging();
            boolean a = pass.PasswordIsValid("Phikjkjkjkjkjkkj");
            assertTrue(a);
        }

        @Test
        void PasswordIsOkTest() {
            Logging pass = new Logging();
            boolean a = pass.PasswordIsOk("Phikjkjkjkjkjkkj");
            assertTrue(a);
        }

    }

