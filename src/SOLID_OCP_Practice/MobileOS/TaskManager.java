package SOLID_OCP_Practice.MobileOS;

public class TaskManager {
	
	public void doText(OS_Shell os) {
		os.TextDefaultApp();
	}
	
	public void playAudio(OS_Shell os) {
		os.AudioDefaultApp();
	}
	
	public void playVideo(OS_Shell os) {
		os.VideoDefaultApp();
	}
	
	public void phoneDetails(OS_Shell os) {
		System.out.println(os);
	}
}
