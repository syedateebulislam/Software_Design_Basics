package SOLID_Liskov_Practice.School_Without_Liskov;

public class School {
public static void main(String[] args) {

	Teacher t2=new SubstituteTeacher();
	try {
		t2.teach();
	} catch (canNotTeachException e) {
		System.out.println(e.getLocalizedMessage());
	}
		t2.otherDuties();
	}
	
}
