package RailWay;

public class Swapping3 {
	public static void main(String[] args) {
		int a=10;
		int b=100;
		int c=5;
		
		System.out.println("Before swap a = "+a+", b = "+b+" and c = "+c);
		
		a = a + b + c;
        b = a - b - c;
        c = a - b - c;
        a = a - b - c;
		System.out.println("After swap a = "+a+" and b = "+b+" and c = "+c);
		
	}
}
