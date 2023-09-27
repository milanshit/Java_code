// Write a java program that reads a collection of positive and negative numbers and multiplies only the
// positive integers. Loop exit should occur when three consecutive negative values are read.

import java.util.Scanner;

public class PositiveNumberMultiplication {
    public static void main(String[] args) {

        int num,c=0,mul=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        while(c<3)
        {
            num=sc.nextInt();
            if(num>0)
            {
                mul*=num;
                c=0;
            }
            else if(num<0)
            {
                c++;
            }
        }
        System.out.print("The required multiplication is :" + mul);

        sc.close();
    }
}
