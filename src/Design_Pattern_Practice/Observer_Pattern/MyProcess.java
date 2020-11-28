package Design_Pattern_Practice.Observer_Pattern;

public class MyProcess {
	public static void main(String[] args) {
		
		EmployeeMgmtSystem ems=new EmployeeMgmtSystem();
				
		Employee e1=new Employee(103,"saral");
		ems.AddEmp(e1);
		
		Employee e2=new Employee(104,"ramdutt");
		ems.AddEmp(e2);
		
		ems.deleteEmp(e1);
	}
}
