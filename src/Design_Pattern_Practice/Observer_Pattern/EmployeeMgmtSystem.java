package Design_Pattern_Practice.Observer_Pattern;
import java.util.Arrays;
import java.util.List;

public class EmployeeMgmtSystem {
	
	//Initial dataset
	Departments d1=new Departments("Hr");
	Departments d2=new Departments("Payroll");
	List<Departments> n1=Arrays.asList(d1,d2);
	//add-remove dept to grp method
	
	EmpDAO dao1=new EmpDAO();
	
	public void showEmp() {
		dao1.showEmployees();
	}
	
	public void deleteEmp(Employee e) {
		dao1.deleteEmployees(e);
		Notify(n1,"Fired");
		dao1.showEmployees();
	}
	
	public void AddEmp(Employee e) {
		dao1.addEmployees(e);
		Notify(n1,"Hired");
		dao1.showEmployees();
	}
	
	private void Notify(List<Departments> l,String action) {
		for(Departments d:l) {
			System.out.println(action+" and notified to "+d.getDeptName());
		}
	}
}