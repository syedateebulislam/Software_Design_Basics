package SOLID_SRP_Practice.Without_SRP;

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
	
	public void LoggingIn(int logInTime) {
		// TODO Auto-generated method stub
		setLogInTime(logInTime);
	}
	
	private void LoggingOut(int logOutTime) {
		// TODO Auto-generated method stub
		setLogOutTime(logOutTime);
	}
	
	public void raiseAlarm() {
		// TODO Auto-generated method stub
		if(getLogOutTime()-getLogInTime()<getDutyHours()) {
			System.out.println("You should stay some more time.");
		}else {
			System.out.println("Bye Champ!!");
		}
	}
	public OfficeAlarm(int logInTime, int logOutTime, int dutyHours) {
		super();
		LogInTime = logInTime;
		LogOutTime = logOutTime;
		DutyHours = dutyHours;
	}

//	public OfficeAlarm(int LogInTime,int LogOutTime,int DutyHours) {
//		
//	}
}