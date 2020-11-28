package SOLID_OCP_Practice.Hospital_Management_By_Interface;

import java.util.List;

public class Emp_DAO {
	
		
	
	public static void AddEmployee(Employee e) {
		
//		Employee e1 = new Employee();
//		e1.setId(e.getId());
//		e1.setDept(e.getDept());
//		e1.setName(e.getName());
//		e1.setWorking(e.isWorking());
//		
		//Save e1 to DB using hibernate here
		
		System.out.println("Employee Successfully Added...");
	}
	
	public static void TerminateEmp(Employee e) {
		//use hibernate to search employee here
		System.out.println("Employee Successfully Removed...");
	}
}
