package SOLID_SRP_Practice.With_SRP;

public class OfficeAlarm {
	
	private int LogInTime;
	private int LogOutTime;
	private int DutyHours;
	
	public int getDutyHours() {
		return DutyHours;
	}
	public void setDutyHours(int dutyHours) {
		DutyHours = dutyHours;
	}
	public int getLogInTime() {
		return LogInTime;
	}
	public void setLogInTime(int logInTime) {
		LogInTime = logInTime;
	}
	public int getLogOutTime() {
		return LogOutTime;
	}
	public void setLogOutTime(int logOutTime) {
		LogOutTime = logOutTime;
	}
		
	public OfficeAlarm(int logInTime, int logOutTime, int dutyHours) {
		super();
		LogInTime = logInTime;
		LogOutTime = logOutTime;
		DutyHours = dutyHours;
	}
}