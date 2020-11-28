package SOLID_OCP_Practice.MobileOS;

public class System_Process {	
	public static void main(String[] args) {
		
		TaskManager RealmeTaskMgr=new TaskManager();
		OS_Shell phone1=new Realme("Realme",6,128);
		RealmeTaskMgr.phoneDetails(phone1);
		RealmeTaskMgr.doText(phone1);
		RealmeTaskMgr.playAudio(phone1);
		RealmeTaskMgr.playVideo(phone1);
		
		
		TaskManager AppleTaskMgr=new TaskManager();
		OS_Shell phone2=new Apple("Apple",8,128);
		AppleTaskMgr.phoneDetails(phone2);
		AppleTaskMgr.doText(phone2);
		AppleTaskMgr.playAudio(phone2);
		AppleTaskMgr.playVideo(phone2);
	}	
}
