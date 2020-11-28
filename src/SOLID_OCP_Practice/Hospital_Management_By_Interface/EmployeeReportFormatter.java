package SOLID_OCP_Practice.Hospital_Management_By_Interface;

public class EmployeeReportFormatter extends ReportFormatter{
public EmployeeReportFormatter(Employee e, FormatType format) {
		super(e, format);
		// TODO Auto-generated constructor stub
	}

	public String getFormattedEmployee() {
		return getFormattedValue();
	}
}
