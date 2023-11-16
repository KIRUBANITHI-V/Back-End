package BloodValue;
import java.util.*;
public class Blood {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age=input.nextInt();
		System.out.print("Enter your weight : ");
		int weight=input.nextInt();
		
		if (age>=18) {
			if (weight>=55) {
				System.out.println("you are eligible for Blood donation");
			}
			else {
				System.out.println("you are under weight");
			}
		}
					System.out.println("you are eligible for Blood donation");
				
	}
	else {
		System.out.println("you are under age");
	}	

}