package hit.day6;

public class Forloopingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=0; i<10; i++) {
	System.out.println(i);
}

for(int n=0;n<10;n++) {
	if (n%2==0) {
	System.out.println("Even number is .."+n);
	}
}
for (int i=0,j=10;i<10&&j>0;i++,j--){
	System.out.println(i+":"+j);
}
	}
}
