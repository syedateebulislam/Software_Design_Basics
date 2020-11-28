package SOLID_ISP_Practice;

import java.util.Random;

public class AllFare implements Kids_Category, Adult_Category {
	//Kids Category
	//vehicles parking lot
	@Override
	public Ticket inParking(Person person) {
		System.out.println(person.getName()+" is in parking lot");
		Ticket newTkt=new Ticket(1,100);
		return newTkt;
	}
	//circus
	@Override
	public void inCircus(Ticket ticketNum) {
		System.out.println(ticketNum+" is inside circus");
		int price=30;
		ticketNum.setVal(ticketNum.getVal()-price);
	}
	//magical show
	@Override
	public void inMagicalShow(Ticket ticketNum) {
		System.out.println(ticketNum+" is in Magical show");
		int price=20;
		ticketNum.setVal(ticketNum.getVal()-price);
	}
	//roller coaster
	@Override
	public void inRollerCoaster(Ticket ticketNum) {
		System.out.println(ticketNum+" is on roller coaster");
		int price=20;
		ticketNum.setVal(ticketNum.getVal()-price);
	}
	//columbus
	public void inColumbus(Ticket ticketNum) {
		System.out.println(ticketNum+" is on columbus");
		int price=20;
		ticketNum.setVal(ticketNum.getVal()-price);
	}
	//toys shop
	@Override
	public void inToys() {
		System.out.println("in toys shop");
	}
	
	//Adult Category
	//snacks shop
	@Override
	public void inSnacks() {
		System.out.println("in snacks shop");
	}
	//coffee shop
	@Override
	public void inCoffee() {
		System.out.println("on coffe shop");
	}
	//clothing shop
	@Override
	public void inClothing() {
		System.out.println("on clothing shop");
	}
	//crockery shop
	@Override
	public void inCrockery() {
		System.out.println("on crockery shop");
	}
}