package org.example;

import java.sql.SQLOutput;

public class DoubleMinimumValue {
    public static void main(String[] args) {
        System.out.println("Double.MIN_VALUE"+Double.MIN_VALUE);

        System.out.println("Long.MIN_VALUE"+Long.MIN_VALUE);
        System.out.println("Integer.MIN_VALUE"+Integer.MIN_VALUE);

        System.out.println("Comparing minimum value"+Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println("Comparing minimum value"+Math.min(Double.MIN_VALUE,0));

        System.out.println("Comparing minimum value"+Math.min(Float.MIN_VALUE,0.0f));

        System.out.println("Comparing minimum value"+Float.MIN_VALUE);

        System.out.println("Comparing minimum value"+Math.min(Double.MIN_VALUE,Double.NEGATIVE_INFINITY));
    }
}
