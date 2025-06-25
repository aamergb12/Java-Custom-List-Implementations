package edu.utdallas.cs2336;

import org.junit.jupiter.api.Test;

public class TestEvensOnly {

    @Test
    public void testNoException() {
        EvensOnly evensOnly = new EvensOnly(2);
        assert (evensOnly.getValue() == 2);
        evensOnly.setValue(6);
        assert (evensOnly.getValue() == 6);
    }

    @Test
    public void testException() {
        try {
            EvensOnly evensOnly = new EvensOnly(3);
            throw new RuntimeException("Should've thrown...");
        } catch ( OddException ex) {
            // Expected
        }

        try {
            EvensOnly evensOnly = new EvensOnly(5);
            throw new RuntimeException("Should've thrown...");
        } catch ( NumberFormatException ex) {
            // Expected
        }

        EvensOnly evensOnly = new EvensOnly(12);
        assert (evensOnly.getValue() == 12);
        try {
            evensOnly.setValue(11);
            throw new RuntimeException("Should've thrown...");
        } catch ( OddException ex) {
            // Expected
        }
        assert (evensOnly.getValue() == 12);
    }
}
