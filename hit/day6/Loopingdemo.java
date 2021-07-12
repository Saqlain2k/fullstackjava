package hit.day6;

public class Loopingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
while (x>0) {
	if(x%2==0) {System.out.println("even number is..."+x);
}
	else {
		System.out.println("odd number is ..."+x);
	}
	--x;
 }
 x=10;
 do {//post condition check...
		String s=(x%2==0)?"even number ..."+x:"odd number is ..."+x;
		System.out.println(s);
		--x;
		}while(x>0);
}
}