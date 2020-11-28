package Design_Pattern_Practice.Observer_Pattern;
import java.util.Arrays;
import java.util.List;

public class Departments {
	private String DeptName;

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	public Departments(String deptName) {
		super();
		DeptName = deptName;
	}
}
