  import java.util.*;
class Atm{
// ATM task

 

// To declare the intial values
   int balance = 100000, withdraw,deposite;

// Using scanner to get information from useres
   Scanner input = new Scanner(System.in);
    

//Get chooice from user
   
              void intial() {
                
    do{
           System.out.println("Automatic Teller Machine");
           System.out.println("Press 1 for withdraw");
           System.out.println("Press 2 for deposite");
           System.out.println("Press 3 for check Balance"); 
           System.out.println("Press 4 for Exit");
           System.out.println("press the opration to perform you want");
           int press =  input.nextInt();
           switch(press)
           {
              case 1:
                    withdrawl();
                    System.out.println("");
                    break;
              case 2:
                    deposite();
                    System.out.println("");
                    break;
              case 3:
                    enquiry();
                    System.out.println("");
                    break;
              case 4:
               System.out.println("Thanks for visiting us");
                    break;

          default:
              System.out.println("Please enter valid data");
           }
    }while(true);         }
               

   
        void withdrawl() {             
                      System.out.println("Enter mony to be withdrawn: ");
//Get the withdrawl money from useres    
                      withdraw = input.nextInt();  
//To check whether the withdrawal amount is greater than of equal to the balance amount
                     if(balance >= withdraw) {
// remove the withdrawl amount from the total balance
               balance = balance - withdraw;
               System.out.println("Please collect your cash "+"₹."+withdraw);
             }
            else {
              System.out.println("Insufficent Balance");
            }
           }  


       void deposite() {
                     System.out.println("Enter mony to be deposite while place the case into the cash box:");
                     deposite = input.nextInt();
                     System.out.println("₹."+deposite+" created successfully in your account"); 
// Add the mony to the balance
                     balance += deposite;      
                   }

// to check the balace                 
       
       void enquiry() {
                    System.out.println("Your Available balace: "+"₹."+balance);
                    }
                    public static void main(String[] args){
                      Atm kiru=new Atm();
                      kiru.intial();
                    }
}  
            
             
                      
            