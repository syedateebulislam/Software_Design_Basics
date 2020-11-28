package SOLID_SRP_Practice.With_SRP;

public class Alarm {
	public static void raiseAlarm(OfficeAlarm a) {
		
		if(a.getLogOutTime()-a.getLogInTime()<a.getDutyHours()) {
			System.out.println("You should stay some more time.");
		}else {
			System.out.println("Bye Champ!!");
		}
	
	}
}
