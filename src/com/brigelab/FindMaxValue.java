package com.brigelab;
import java.util.Arrays;

public class FindMaxValue<T extends Comparable<T>> {
    T[] elements;
    public FindMaxValue(T[] elements) {
        this.elements = elements;

    }
    /**
     * Generics method to store values in array and return maximum value
     * return max : Maximum of three values
     */
    public static <T extends Comparable<T>> T maxOfValue(T[] elements) {
        Arrays.sort(elements);
        int length = elements.length;
        T max = elements[length - 1];
        return max;
    }



    public static void main(String[] args) {
        System.out.println("Welcome to program to find maximum value using generics ");
        Integer [] intMax = {10,20,30,21,16,99,8};
        System.out.println("Maximum b/w three Integer is : " + maxOfValue(intMax));
        Float [] floatMax = {5.6f,56.4f,43.5f,67.9f};
        System.out.println("The Maximum b/w three floats is : " + maxOfValue(floatMax));
        String[] stringMax = { "sdf","cfd","mpl","ipl","bcc","ddn", "zyx", "bbl"};
        System.out.println("The maximum b/w three string is : " + maxOfValue(stringMax));



    }
}

