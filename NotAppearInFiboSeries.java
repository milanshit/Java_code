// Write a java program that prints the numbers that do not appear in Fibonacci series. Number of such
// terms to be printed should be given by the user.

import java.util.Scanner;
public class NotAppearInFiboSeries {

	public static void main(String[] args) {

		int i=1,x=0,y=1,z=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of such terms :: ");
        r=sc.nextInt();
        System.out.print("The numbers which do not appear in Fibonacci Series is: ");
        for(int c=1;c<=r;i++)
        {
            while(z<i)
            {
                z=x+y;
                x=y;
                y=z;
            }
            if(i!=z)
            {
                System.out.print(" "+ i + " ,");
                c++;
            }
        }
        sc.close();
    }
}


