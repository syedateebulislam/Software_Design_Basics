package SOLID_OCP_Practice.MobileOS;

public class Realme extends OS_Shell{

	public Realme(String device_name, int rAM, int internal_Storage) {
		super(device_name, rAM, internal_Storage);
		// TODO Auto-generated constructor stub
	}
	
	public static String startTextApp() {
		return "Realme default text messaging app in use...";
	}
	@Override
	public	String TextDefaultApp() {
		return startTextApp();	
	}
	
	public static String startAudioApp() {
		return "Realme default audio player app in use...";		
	}
	@Override
	public String AudioDefaultApp() {
		// TODO Auto-generated method stub
		return startAudioApp();
	}

	public static String startVideoApp() {
		return "Realme default video player app in use...";		
	}
	@Override
	public	String VideoDefaultApp() {
		return startVideoApp();
	}
}
