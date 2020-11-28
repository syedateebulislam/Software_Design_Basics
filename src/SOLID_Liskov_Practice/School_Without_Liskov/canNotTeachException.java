package SOLID_Liskov_Practice.School_Without_Liskov;

public class canNotTeachException extends Exception {
	
	@Override
	public String getLocalizedMessage() {
		// TODO Auto-generated method stub
		return "cant teach any subject";
	}
}
