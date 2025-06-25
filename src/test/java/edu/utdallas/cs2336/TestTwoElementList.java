package edu.utdallas.cs2336;

import org.junit.jupiter.api.Test;

public class TestTwoElementList {

    @Test
    public void testLegalUse() {
        TwoElementList<Integer> twoInts = new TwoElementList<>();
        assert (twoInts.get(0) == null);
        assert (twoInts.get(1) == null);

        twoInts.set(0, 15);
        twoInts.set(1, 50);
        assert (twoInts.get(0) == 15);
        assert (twoInts.get(1) == 50);

        TwoElementList<String> twoStrings = new TwoElementList<>();
        assert (twoStrings.get(0) == null);
        assert (twoStrings.get(1) == null);

        twoStrings.set(0, "Hello");
        twoStrings.set(1, "There");
        assert (twoStrings.get(0).equals("Hello"));
        assert (twoStrings.get(1).equals("There"));
    }

    @Test
    public void testExceptions() {
        TwoElementList<String> twoStrings = new TwoElementList<>();
        try {
            twoStrings.set(-1, "Hello");
            throw new RuntimeException("Should've thrown...");
        } catch ( IndexOutOfBoundsException ex) {
            // Expected
        }

        try {
            twoStrings.set(2, "There");
            throw new RuntimeException("Should've thrown...");
        } catch ( IndexOutOfBoundsException ex) {
            // Expected
        }

        try {
            twoStrings.get(-1);
            throw new RuntimeException("Should've thrown...");
        } catch ( IndexOutOfBoundsException ex) {
            // Expected
        }

        try {
            twoStrings.get(2);
            throw new RuntimeException("Should've thrown...");
        } catch ( IndexOutOfBoundsException ex) {
            // Expected
        }
    }
}
