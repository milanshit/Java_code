// Write a java program to find the LCM of two given integers.

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number: ");
		int a=args[0];
		int b=args[1];
		int g=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0&&b%i==0)
				g=i;
		}
		int lcm=a*b/g;
		System.out.println("LCM= "+lcm);

        sc.close();
    }
}
