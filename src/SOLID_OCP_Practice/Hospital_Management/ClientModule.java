package SOLID_OCP_Practice.Hospital_Management;

import java.util.Scanner;

public class ClientModule {
	public static void main(String[] args) {
		System.out.println("*** Client Module Started ***");
		
		Scanner sc = new Scanner(System.in);
		
		Employee e = null;
		e.setId(121);
		e.setName("John");
		e.setDept("Development");
		e.setWorking(true);
		
		System.out.println("Task-");
		System.out.println("1: Print Employee Report");
		System.out.println("2: Hire New Employee");
		System.out.println("3: Terminate Employee");
		
		int inp=sc.nextInt();
		
		System.out.println(inp);
		
		if(inp==1) {
			FormatType format = FormatType.XML;
			EmployeeReportFormatter e1= new EmployeeReportFormatter(e, format);
			System.out.println("Selected format is  "+format);
			System.out.println(e1.getFormattedEmployee());
			
		}
		if(inp==2) {
			Emp_DAO.AddEmployee(e);
		}
		if(inp==3) {
			Emp_DAO.TerminateEmp(e);
		}
	}
}