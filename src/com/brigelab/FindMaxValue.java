package com.brigelab;

public class FindMaxValue {
    /**
     * Generic method to compare any type of data   and maximum
     * a1 : First value to compare
     * a2 : Second value to compare
     * a3 : Third value to compare
     * return max: Maximum of three values
     */
    public static <T extends Comparable<T>> T maxOfValues(T a1,T a2, T a3) {
        T max = a1;
        if (a2.compareTo(max)> 0)
            max =a2;
        if (a3.compareTo(max) > 0)
        max =a3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program to find the maximum value using generics");
        Integer a1= 3, a2 =4, a3 = 9;
        System.out.println("the maximum b/w three integer is :" + maxOfValues(a1,a2,a3));
        Float f1 =3.5f, f2 = 9.5f, f3 = 7.4f;
        System.out.println("The maximum b/w three float is :" + maxOfValues(f1,f2,f3));
        String s1 = "ads", s2 = "swe", s3 = "ytr";
        System.out.println("The Maximum b/w three string is " + maxOfValues(s1,s2,s3));
    }
}
 



