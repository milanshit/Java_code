// Write a program in Java to check if a given number is present in the last digit(s) of its square.
// For example, 25 is a such number as its square is 625 and 25 is present as the last digits. Few more
// example are: 52 = 25, 62 = 36, and 762 = 5776 etc.

import java.util.Scanner;

public class CheckNumInLastDigitsOfSquare {
    public static void main(String[] args) {
        long num,c=0,r,s=0,rev=0;
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter no.:");
        num=ob.nextLong();
        long square=num*num;
        System.out.println("Square= "+square);
        long no=num;
        while(num!=0) {
            c++;
            num/=10;
        }
        while(c!=0) {
            r=square%10;
            s=s*10+r;
            square/=10;
            c--;
        }
        while(s!=0) {
            r=s%10;
            rev=rev*10+r;
            s/=10;
        }
        if(rev==no)
            System.out.println(no+" is present in the last digit(s) of its square.");
        else
            System.out.println(no+" is not present in the last digit(s) of its square.");

        ob.close();
    }
}
