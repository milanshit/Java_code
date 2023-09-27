// Write a program in Java to solve the following problem -
// You are given a sorted (either in the increasing or in the decreasing order) sequence of numbers, ending
// with a -1. You can assume that are at least two numbers before the ending -1. You have to output the
// number of distinct elements in the sorted sequence. Do not use arrays in the code.

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
        
        int prevElement = Integer.MAX_VALUE;
        int distinctCount = 0;
        
        System.out.println("Enter the elements in sorted sequence:");
        while (true) {
            int currentElement = ob.nextInt();
            
            if (currentElement == -1) {
                break; 
            }
            
            if (currentElement != prevElement) {
                distinctCount++;
            }
            
            prevElement = currentElement;
        }
        
        ob.close();
        
        System.out.println("Number of distinct elements: " + distinctCount);
	}
}
