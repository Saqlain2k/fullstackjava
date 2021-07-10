package hit.day5;

public class castingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//number.floats.character.boolean
		
		//numbers
		//lower stored in higher...compatible types
		
		byte b=10;//8bit
		short s=b;//16bit
		int i=s;//32bit
		long l=i;//64bit
		
		//reverse storing highest to lowest
		long ll=257;//64bit
		System.out.println("long value is  "+ll);
		int ii=(int)ll;
		System.out.println("int value is "+ii);
		short ss=(short)ll;
		System.out.println("short value is"+ss);
		byte bb=(byte)ss;
		System.out.println("byte  value is "+bb);
				
	}

}
