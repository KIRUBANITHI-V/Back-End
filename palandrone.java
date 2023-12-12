import java.util.Scanner;
class palandrone {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Here : ");
         String name = input.next();
         String newName="";

         for(int i=name.length()-1;i>=0;i--){
            newName = newName + name.charAt(i);
            }
          
    if(name==newName){
             System.out.println(name+" is palandrone");
    }
    else{
             System.out.println(name+" is not a pandrone");
    }
                
}

}
              
         