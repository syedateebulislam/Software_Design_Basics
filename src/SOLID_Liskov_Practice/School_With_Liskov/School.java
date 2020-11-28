package SOLID_Liskov_Practice.School_With_Liskov;

public class School {
public static void main(String[] args) {
		
		MathTeacher s1=new MathTeacher();
		s1.teach();
		s1.getSalary();
		s1.otherDuties();
		
		ScienceTeacher s2=new ScienceTeacher();
		s2.teach();
		s2.getSalary();
		s2.otherDuties();
		
		SchoolStaff s3=new SubstituteTeacher();
		s3.getSalary();
		s3.otherDuties();
	}
}
