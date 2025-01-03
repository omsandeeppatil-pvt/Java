import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AssertionDemo {

    @BeforeEach
    void setup() {
        System.out.println("Setting up the test environment...");
    }

    @Test
    void testAssertions() {
        assertAll("Multiple Assertions",
                () -> assertEquals(10, 5 + 5, "Sum mismatch"),
                () -> assertTrue("Java".startsWith("J"), "String mismatch"),
                () -> assertNotNull("JUnit", "Object is null")
        );
    }

    @AfterEach
    void cleanup() {
        System.out.println("Cleaning up after the test...");
    }
}
