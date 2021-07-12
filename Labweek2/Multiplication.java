package Labweek2;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in)) {
	
	System.out.println("enter the value of i..");
	int i=scan.nextInt();
	
	System.out.println("enter the value of j...");
	int j=scan.nextInt();
	int mul=i*j;
	System.out.println("The value is "+mul);
}

	}

}
