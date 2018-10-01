package com.ymatin.education.generics;

import java.io.Serializable;
import java.util.function.IntFunction;

public class GenericMethods {

    public static <T extends Comparable> T getMin(T[] array){
        T min = array[0];
        for (T value : array){
            if(value.compareTo(min) > 0) {
                min = value;
            }
        }
        return min;
    }

    public static <T extends Comparable & Serializable> T getMin(T[] array, int val){ return null; }

    public static <T> T getMiddle(T... values) {
        return values[values.length/2];
    }

    @SafeVarargs public static <T> T[] getArray(T... args){
        return args;
    }

    public static <T> T[] getArray(IntFunction<T[]> constructor, T... values){ return null;}
}
