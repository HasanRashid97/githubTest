import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat c;

    @BeforeEach
            void setUp() {
                c = new Cat("Fluffy", 'F', 10);
            }
    @Test
    void getName() {
        assertNotNull(c.getName());
        assertFalse(c.getName().isEmpty());
    }

    @Test
    void getGender() {
        char actualGender = Character.toLowerCase(c.getGender());
        char expectedGenderM = Character.toLowerCase('M');
        char expectedGenderF = Character.toLowerCase('F');

        assertTrue(actualGender == expectedGenderM || actualGender == expectedGenderF);
    }

    @Test
    void getWeightInKg() {
        assertTrue(c.getWeightInKg() > 0 && c.getWeightInKg() <= 10);
    }
}