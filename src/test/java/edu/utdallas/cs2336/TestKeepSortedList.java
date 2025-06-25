package edu.utdallas.cs2336;

import org.junit.jupiter.api.Test;

import java.util.*;

public class TestKeepSortedList {

    @Test
    public void testAddSingle() {
        KeepSortedList<String> keepSorted = new KeepSortedList<>();
        keepSorted.add("hi");
        keepSorted.add("add");
        keepSorted.add("zzz");
        keepSorted.add("def");
        keepSorted.add("see");

        List<String> expected = Arrays.asList(new String[]{"add", "def", "hi", "see", "zzz"});
        assert (expected.equals(keepSorted.getBackingList()));
    }

    @Test
    public void testAddAll() {
        KeepSortedList<Integer> keepSorted = new KeepSortedList<>();
        List<Integer> thingsToAdd = new ArrayList<>();
        thingsToAdd.add(345);
        thingsToAdd.add(667);
        thingsToAdd.add(1);
        thingsToAdd.add(3);
        thingsToAdd.add(993);
        keepSorted.add(thingsToAdd);
        List<Integer> theCopy = new ArrayList<>(thingsToAdd);
        Collections.sort(theCopy);
        assert(theCopy.equals(keepSorted.getBackingList()));
    }
}
