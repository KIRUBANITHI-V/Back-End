package RailWay;
import java.util.Scanner;
public class PrimrNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int Prime = input.nextInt();
		int flag=0;
       for(int i=2;i<=Prime/2;i++) {
       if (Prime%i==0) {
           System.out.println(Prime+" can divide by "+i);
    	   flag=1;
       }
       }
       if (flag!=0) {
    	   System.out.println("");
    	   System.out.println("So "+Prime+" is not prime");
       }
       else {
    	   System.out.println(Prime+" is prime");
       }
		
	}

}

