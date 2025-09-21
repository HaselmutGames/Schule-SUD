package test.ls04.mitarbeiter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ls04.mitarbeiter.Mitarbeiter;

class MitarbeiterTest {

    static class DummyMitarbeiter extends Mitarbeiter {
        public DummyMitarbeiter(int id, String name) {
            super(id, name);
        }
        @Override
        public double einkommen() {
            return 1000.0;
        }
    }

    @Test
    void testValidConstructor() {
        DummyMitarbeiter m = new DummyMitarbeiter(1234, "Max Mustermann");
        assertEquals(1234, m.getId());
        assertEquals("Max Mustermann", m.getName());
    }

    @Test
    void testInvalidIdTooSmall() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new DummyMitarbeiter(999, "Test");
        });
        assertTrue(ex.getMessage().contains("Die ID muss vierstellig und positiv sein."));
    }

    @Test
    void testInvalidIdTooLarge() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new DummyMitarbeiter(10000, "ID");
        });
        assertTrue(ex.getMessage().contains("Die ID muss vierstellig und positiv sein."));
    }

    @Test
    void testInvalidNameNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new DummyMitarbeiter(1234, null);
        });
        assertTrue(ex.getMessage().contains("Der Name darf nicht leer sein."));
    }

    @Test
    void testInvalidNameEmpty() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new DummyMitarbeiter(1234, "   ");
        });
        assertTrue(ex.getMessage().contains("Der Name darf nicht leer sein."));
    }

    @Test
    void testToString() {
        DummyMitarbeiter m = new DummyMitarbeiter(4321, "Anna");
        String s = m.toString();
        assertTrue(s.contains("4321"));
        assertTrue(s.contains("Anna"));
    }

    @Test
    void testEinkommen() {
        DummyMitarbeiter m = new DummyMitarbeiter(1234, "Test");
        assertEquals(1000.0, m.einkommen());
    }
}