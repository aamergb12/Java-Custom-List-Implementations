
package edu.utdallas.cs2336;
import java.util.ArrayList;
import java.util.List;


public class KeepSortedList<T extends Comparable<T>> { 
    private List<T> backingList = new ArrayList<>();

    public void add(T newValue) {
        int index = 0;
        while (index < backingList.size() && backingList.get(index).compareTo(newValue) < 0) {
            index++;
        }
        backingList.add(index, newValue);  
    }

    public void add(List<T> newValues) {
        for (T element : newValues) {
            add(element);
        }
    }

    public List<T> getBackingList() {
        return backingList;
    }
}

