package Labweek2;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the lenght of rectangle");
double length= scan.nextDouble();
System.out.println("Enter the width of rectangle");
double width=scan.nextDouble();
double area=length*width;
System.out.println("Area of rectangle "+area);

	}

}
