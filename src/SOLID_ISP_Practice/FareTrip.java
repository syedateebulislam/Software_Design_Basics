package SOLID_ISP_Practice;

public class FareTrip {
	public static void main(String[] args) {
	
		Person p1=new Person(28,"Ateeb");
		AllFare f1= new AllFare();
		
		Ticket t1=f1.inParking(p1);
		f1.inCircus(t1);
		f1.inMagicalShow(t1);
		f1.inClothing();
		f1.inSnacks();
		
		
		Person p2=new Person(4,"Shyaan");
		KidsPark f2= new KidsPark();

		Ticket t2=f2.inParking(p2);
		f2.inCircus(t2);
		f2.inMagicalShow(t2);
		f2.inColumbus(t2);
		f2.inRollerCoaster(t2);
		
	}	
}
