package RailWay;

import java.util.Scanner;

public class TrainTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to Indian Railways");
		System.out.println("");
		System.out.println("  Locomotive  ");
        System.out.println("     o---o   ");
        System.out.println("   | |[ ]| | ");
        System.out.println("   | |===| | ");
        System.out.println(" __|_[_]_|__ ");
        System.out.println("|===========|");
        System.out.println("|___________|");
        System.out.println("  |_|_| |_|_|\n");
        System.out.println("");
		System.out.print("Enter a Railway timing : ");
		String Time = input.next();
		 switch (Time) {
		 case "00:00" :
			 System.out.println("Mumbai express is availabele on platform no:11");
			 System.out.println("It will starts its journey at the time of 00:30");
			 System.out.println("Thank you");
			 break;
		 case "02:00" :
			 System.out.println("Kolkatta express is availabele on platform no:11");
			 System.out.println("It will starts its journey at the time of 02:30");
			 System.out.println("Thank you");
			 break;
		 case "04:00" :
			 System.out.println("vandhea bharath is availabele on platform no:05");
			 System.out.println("It will starts its journey at the time of 04:10");
			 System.out.println("Thank you");
			 break;
		 case "06:00" :
			 System.out.println("chearan express is availabele on platform no:01");
			 System.out.println("It will starts its journey at the time of 07:15");
			 System.out.println("Thank you");
			 break;
		 case "08:00" :
			 System.out.println("Corba kochchveli express is availabele on platform no:03");
			 System.out.println("It will starts its journey at the time of 08:30");
			 System.out.println("Thank you");
			 break;
		 case "10:00" :
			 System.out.println("Sabapath is availabele on platform no:01");
			 System.out.println("It wiil starts its journey at the time of 11:30");
			 System.out.println("Thank you");
			 break;
		 case "12:00" :
			 System.out.println("neelgrees express is availabele on platform no:02");
			 System.out.println("It will starts its journey at the time of 12:45");
			 System.out.println("Thank you");
			 break;
		 case "14:00" :
			 System.out.println("Bangalore express is availabele on platform no:01");
			 System.out.println("It will starts its journey at the time of 14:00");
			 System.out.println("Thank you");
			 break;
		 case "16:00" :
			 System.out.println("Goa pasangers train is availabele on platform no:06");
			 System.out.println("It will starts its journey at the time of 16:30");
			 System.out.println("Thank you");
			 break;
		 case "18:00" :
			 System.out.println("kanniyakumari express is availabele on platform no:04");
			 System.out.println("It will starts its journey at the time of 19:30");
			 System.out.println("Thank you");
			 break;
		 case "20:00" :
			 System.out.println("Chennai ss is availabele on platform no:03");
			 System.out.println("It will starts its journey at the time of 21:00");
			 System.out.println("Thank you");
			 break;
		 case "22:00" :
			 System.out.println("Noyyal is availabele on platform no:01");
			 System.out.println("It will starts its journey at the time of 22:30");
			 System.out.println("Thank you");
			 break;
			 default:
			 System.out.println("Enter valid time");
			 
		 }
		
	}

}
