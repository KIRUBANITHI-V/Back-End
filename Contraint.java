package Cinstraint;

public class Contraint {
	String place,Food;
	int KM,Price;
	
	
	 Contraint() {
		place ="Pollachi";
		KM = 560;
	}
	 Contraint(String str,int n){
		 place = str;
		 KM = n;
	 }
	Contraint(Contraint  other){
		place = other.place;
		KM = other.KM;
	}
	public static void main(String[] args) {
		Contraint a=new Contraint();
		System.out.println("Mother of nature is "+a.place);
		System.out.println("Your location to "+a.place+" located on "+a.KM+"km distance");
		System.out.println("");
		
		Contraint b=new Contraint("Thalanar",640);
		System.out.println(b.place+" is a Heaven on Earth");
		System.out.println("Your location to "+b.place+" located on "+b.KM+"km distance");
		System.out.println("");
		
		Contraint c=new Contraint(a);
		System.out.println(c.place);
		System.out.println(c.KM);
		
	}
}