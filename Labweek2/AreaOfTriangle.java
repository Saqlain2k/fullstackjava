package Labweek2;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the width of the triangle:");
double base= scan.nextDouble();
System.out.println("Enter the height of triangle");
double height= scan.nextDouble();

double area=(base*height)/2;
System.out.println("Area of triangle"+area);
;
	}

}
