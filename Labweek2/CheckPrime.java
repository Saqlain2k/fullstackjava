package Labweek2;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter any number:");
        //captuer the inout in an integer
		int num=scan.nextInt();
		scan.close();
		for(int i=2;i<num/2;i++)
		{
			temp=num%1;
			if(temp==0)
			{
		isPrime=false;
		break;
	}
      }
//if prime is a true then the number is priரூ else not
if(isPrime)
 System.out.println(num+"is a Prime Number");
else
	System.out.println(num+"is not a Prime Number");
		
			

}
}