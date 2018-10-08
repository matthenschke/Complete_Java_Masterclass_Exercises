package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*
    // width of int = 32 (4 bytes)
	int myIntValue = 5 / 3;
	// width of float = 32 (4 bytes)
	float myFloatValue = 5f / 3f;
	// width of double = 64 (8 bytes)
	double myDoubleValue = 5d / 3d;
	System.out.println("myIntValue " + myIntValue);
	System.out.println("myFloatValue " + myFloatValue);
	System.out.println("myDoubleValue " + myDoubleValue);
	*/
	//Convert a given number of pounds to kilograms
    // 1. Create a variable to store the number of pounds
    // 2. Calculate the number of kilograms for the number above and store it in a variable.
    // 3. Print out the result.
    //
    //NOTES: 1 pound is equal to 0.45359237 kilograms
    Scanner input = new Scanner(System.in);
    System.out.println("Pounds to Kilograms Converter");
    System.out.println("Please enter the number of pounds");
    double pounds = input.nextDouble();
    double multiplier = 0.45359237;
    System.out.println(pounds * multiplier + " kilograms");
    }
}