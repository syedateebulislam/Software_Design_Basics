package SOLID_Liskov_Practice.School_With_Liskov;

public class ScienceTeacher extends SchoolStaff implements TeachingStaff{

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("Teach Science.");
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("25k salary credited in your account.");
	}
}
