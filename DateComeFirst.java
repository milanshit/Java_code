/*Write a Java program that reads in two dates (using three integers for each) and displays a message
showing the date that comes first. */

import java.util.*;
public class DateComeFirst {

	public static void main(String[] args) {
		int d1,m1,y1,d2,m2,y2;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the first date :: ");
		d1=ob.nextInt();
		m1=ob.nextInt();
		y1=ob.nextInt();
		System.out.print("Enter the second date :: ");
		d2=ob.nextInt();
		m2=ob.nextInt();
		y2=ob.nextInt();
		if(y1>y2 || (y1==y2 && m1>m2) || (y1==y2 && m1==m2 && d1>d2))
			System.out.println(d2+"/ "+m2+"/ "+y2);
		else
			System.out.println(d1+"/ "+m1+"/ "+y1);	

        ob.close();
	}
}