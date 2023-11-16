package RiverOver;
import java.util.Scanner;
public class HelpMe {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		    System.out.println("    /\\_/\\   ");
	        System.out.println("   ( o o )  ");
	        System.out.println("    ( - )   ");
	        System.out.println("   / \\_/ \\  ");
	        System.out.println("  /       \\ ");
	        System.out.println(" /         \\");
	        System.out.println(" |         |");
	        System.out.println(" |         |");
	        System.out.println("     |||     ");

		System.out.println("Monkey : Hai there ! please help me to cross this River");
        System.out.println("you : Dont worry Monkey i will help you");
        System.out.println("Monkey : Thank you !");
        System.out.println("You: just select one time from");
        System.out.println("Morning ?");
        System.out.println("Afternoon ?");
        System.out.println("Evening ?");
        System.out.println("Night ?");
        System.out.print("Monkey : ");
        String Time= input.next();
        input.close();
        
        switch (Time){
        	case "Morning":
        		System.out.println("oops ! "+Time+" time that crocodile will be awake... it will kill and eat you. Wait till Afternoon !");
        		break;
            case "Afternoon":
    		    System.out.println("Greate! "+Time+" time is the sleeping time of  crocodile... so you can cross the river by jumps over the Crocodile");
    		    break;
    		
    	    case "Evening":
    		    System.out.println("oops ! "+Time+" time that crocodile will be awake... it will kill and eat you.Wait till Morning");
    		    break;
    		 
    	    case "Night":
    		    System.out.println("Greate! "+Time+" time is the sleeping time of  crocodile... so you can cross the river by jumps over the Crocodile");
    		    break;
	        default :
    	        System.out.print("!!!Provide valid Time !!!!");
     }
    	 
}
}
