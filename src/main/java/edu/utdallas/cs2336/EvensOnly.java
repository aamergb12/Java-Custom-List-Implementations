
package edu.utdallas.cs2336;

public class EvensOnly {
    private int value;

    public EvensOnly(int value) {
        if (value % 2 == 0) {
            this.value = value;
        } else {
            throw new OddException("Value must be even");
        }
    }

    // TODO: Constructor that takes an integer and throws OddException if it's odd
    //  or sets value if even.

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
       if (value % 2 == 0) {
           this.value = value;
       } else {
           throw new OddException("Value must be even");
       }
    }

    

    // TODO: setValue: just like the constructor
}
