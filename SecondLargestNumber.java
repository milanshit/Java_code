//Write a java program to print the second largest number among a list of numbers.

import java.util.Scanner;

public class SecondLargestNumber{
    public static void main(String[] args) {
        int n,a,max=0,secMax=0;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		n=ob.nextInt();
		System.out.print("Enter the elements: ");
		do {
			a=ob.nextInt();
			if(max<a) {
				secMax=max;
				max=a;
			}
			else if(secMax<a && max>a)
				secMax=a;
			    n--;
		}
		while(n>0);
		System.out.println(secMax);

        ob.close();
    }
}