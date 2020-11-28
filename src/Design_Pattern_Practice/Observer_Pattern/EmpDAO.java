package Design_Pattern_Practice.Observer_Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpDAO {
	
	Employee e1=new Employee(101,"saral");
	Employee e2=new Employee(102,"ramdutt");
	List<Employee> l1=new ArrayList<Employee>();
	
		
	public  void showEmployees() {
		System.out.println(l1.toString());
	}
	
	public  void addEmployees(Employee e) {
		System.out.println(e.getEmpName()+" is Hired.");
		l1.add(e);
	}
	
	public  void deleteEmployees(Employee e) {
		System.out.println(e.getEmpName()+" is Fired.");
		l1.remove(e);
	}
}