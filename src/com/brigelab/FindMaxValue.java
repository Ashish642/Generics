package com.brigelab;

public class FindMaxValue {
    /**
     * Method used to compare three integer values and get maximum the maximum valu.
     *  a1 :First value to compare
     * a2 : Second valu to compare 
       a3 : Third value to compare
     * compare to max : Maximum of three integers
     */
    public static Integer maxOfInteger(Integer a1,Integer a2, Integer a3) {
        Integer max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;

    }

    /**
     * Method to compare three float values and get the maximum valu.
     * f1 : First value to compare .
     * f2 : Second value to compare.
     * f3 : Third value to compare.
     * return max : Maximum of three float
     */

    public static Float maxOfFloat(Float f1, Float f2, Float f3) {
        Float max = f1;
        if (f2.compareTo(max) > 0)
            max = f2;
        if (f3.compareTo(max) > 0)
            max = f3;
        return max;
    }

    /**
     * Method to compare three string and get the maximum value.
     * s1 : First valu to compare.
     * s2 : Second value to compare.
     * s3 : Third value to compare.
     * return max : Maximum of three string
     */
    public static String maxOfString(String s1,String s2, String s3) {
        String max = s1;
        if (s2.compareTo(max)>0)
            max = s2;
        if (s3.compareTo(max)>0)
            max = s3;
        return  max;


    }



    public static void main(String[] args) {
        System.out.println("Welcome to program to find maximum value ");
        Integer a1 = 30, a2 = 40, a3 = 90;
        System.out.println("Maximum b/w three Integer is : " + maxOfInteger(a1, a2, a3));
        Float f1 = 3.6f, f2 = 9.4f, f3 = 7.6f;
        System.out.println("The Maximum b/w three floats is : " + maxOfFloat(f1,f2,f3));
        String s1 = "abc", s2 = "rat", s3 = "mat";
        System.out.println("The maximum b/w three string is : " +maxOfString(s1, s2, s3));



    }
}

