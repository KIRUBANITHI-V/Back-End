class Regression {
int a=0;
     void Res() {
           if (a<=100) {
           System.out.println(a+" Kirubanithi");
           a++;
           Res();
           }
}
 public static void main(String[] args) {
         Regression loop=new Regression();
         loop.Res();
}
}