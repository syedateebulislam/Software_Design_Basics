package SOLID_ISP_Practice;


public class KidsPark implements Kids_Category{

	@Override
	public Ticket inParking(Person person) {
		System.out.println(person.getName()+" is in parking lot");
		Ticket newTkt=new Ticket(1,100);
		return newTkt;
	}

	@Override
	public void inCircus(Ticket ticketNum) {
		System.out.println(ticketNum+" is inside circus");
		int price=30;
		ticketNum.setVal(ticketNum.getVal()-price);
	}

	@Override
	public void inMagicalShow(Ticket ticketNum) {
		System.out.println(ticketNum+" is in Magical show");
		int price=20;
		ticketNum.setVal(ticketNum.getVal()-price);
	}

	@Override
	public void inRollerCoaster(Ticket ticketNum) {
		System.out.println(ticketNum+" is on roller coaster");
		int price=20;
		ticketNum.setVal(ticketNum.getVal()-price);
	}

	@Override
	public void inColumbus(Ticket ticketNum) {
		System.out.println(ticketNum+" is on columbus");
		int price=20;
		ticketNum.setVal(ticketNum.getVal()-price);
	}


	@Override
	public void inToys() {
		System.out.println("in toys shop");
	}
}
