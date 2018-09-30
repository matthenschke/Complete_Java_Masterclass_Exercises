package com.company;

public class Main {
    /**
     * Second programming challenge in the course
     * 1. Create a byte variable and set it to any valid byte number
     * 2. Create a short variable and set it to any valid short number
     * 3. Create a int variable and set it to any valid number
     * 4. Create a variable of type long, and make it equal to
     * 50000 + 10 times the sum of the byte, plus ths short plus the int
     */

    public static void main(String[] args) {

      //declaring my variables
      byte myByteValue = 121;
      short myShortValue = 32221;
      int myIntValue = 1222229;
      long longTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
      short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));

      System.out.println("Long Total: " + longTotal);
      System.out.println("Short Total: " + shortTotal);



    }
}
