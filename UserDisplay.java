package ScannerUse;

import java.util.Scanner;

public class UserDisplay {
  public static void main(String[] args) 
  {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter your name :");
	  String name=input.next();
	  System.out.print("Enter your age :");
	  int age=input.nextInt();
	  
	  if (age>=18) {
		  System.out.println("Eligible for vote");
	  } 
	  else {
		  System.out.println("Not eligible");
	  }
	  
}
}
	
 
