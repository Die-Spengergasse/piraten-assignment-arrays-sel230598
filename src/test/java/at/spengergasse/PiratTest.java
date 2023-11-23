package at.spengergasse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiratTest {
    Pirat testPirat;
    @BeforeEach
    void setUp() {
        testPirat=new Pirat("Volker", 80, true);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
    }

    @Test
    void getGesundheit() {

        Pirat p1 = new Pirat("Volker", 100, false);
        p1.kielholen();
        assertEquals(p1.getGesundheit(), 70);
        // Funktioniert die Methode korrekt, so wird nach dem Kielholen eines
        // Piraten ohne Holzbein 90 erwartet.
        System.out.println("Erwartet: 90; Ist: " + p1.getGesundheit());
    }

    @Test
    void getHolzbein() {
    }

    @Test
    void setName() {
    }

    @Test
    void setGesundheit() {
    }

    @Test
    void setHolzbein() {
    }

    @Test
    void kielholen() {
    }

    @Test
    void trinkeRum() {
        testPirat.trinken('r');
        assertEquals( 100, testPirat.getGesundheit());
    }
    @Test
    void trinkeWasser(){
        testPirat.trinken('w');
        assertEquals(70, testPirat.getGesundheit());
    }

    @Test
    void print() {

    }

    @Test
    void testToString() {
    }
}