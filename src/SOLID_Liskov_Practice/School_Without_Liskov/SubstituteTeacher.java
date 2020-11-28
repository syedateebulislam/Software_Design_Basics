package SOLID_Liskov_Practice.School_Without_Liskov;

public class SubstituteTeacher extends Teacher{

	@Override
	public void teach() throws canNotTeachException{
		//do nothing or
		throw new canNotTeachException();
	}
	
}
