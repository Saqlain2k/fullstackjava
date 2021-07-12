package Labweek2;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter the radius: ");
 double radius=scan.nextDouble();
 double area=Math.PI*(radius*radius);
 double circumference=Math.PI*2*radius;
 System.out.println("The circumference of radius "+circumference);
 
	} 

}
