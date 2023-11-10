class Fibonacci 	 
{    
   int i;
   int a=0,b=1;
        void Fab() 
        {
             for(i=0;i<=200;i++)
	     {		
             i=a+b;
             a=b;
             b=i;
             
             System.out.println("Fibonacci Seies = "+i);
	     }		

         }
          public static void main(String[] args)
	   {
                Fibonacci feb=new Fibonacci();
                feb.Fab();
           }
    
}