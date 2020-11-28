package SOLID_SRP_Practice.With_SRP;

public class TimeLogs {

	public static void LogTimings(int in,int out,int duty) {
		OfficeAlarm a1=new OfficeAlarm(in,out,duty);
		Alarm.raiseAlarm(a1);
	}

}
