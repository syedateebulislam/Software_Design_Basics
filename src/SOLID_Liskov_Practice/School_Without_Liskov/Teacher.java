package SOLID_Liskov_Practice.School_Without_Liskov;

public abstract class Teacher {
	
	public abstract void teach() throws canNotTeachException;
	
	public void otherDuties() {
		
		takeAttend();
		examDuties();
		checkAnsSheet();
	}
	protected void takeAttend() {
		System.out.println("take class attendance.");
	}
	
	protected void examDuties() {
		System.out.println("perform exam duty.");
	}
	
	protected void checkAnsSheet() {
		System.out.println("chk ans sheets.");
	}
}
