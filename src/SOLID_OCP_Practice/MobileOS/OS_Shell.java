package SOLID_OCP_Practice.MobileOS;

abstract public class OS_Shell {
	private String Device_name;
	private int RAM;
	private int Internal_Storage;
	
	public String getDevice_name() {
		return Device_name;
	}

	public void setDevice_name(String device_name) {
		Device_name = device_name;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public int getInternal_Storage() {
		return Internal_Storage;
	}

	public void setInternal_Storage(int internal_Storage) {
		Internal_Storage = internal_Storage;
	}

	@Override
	public String toString() {
		return "OS_Shell [Device_name=" + Device_name + ", RAM=" + RAM + ", Internal_Storage=" + Internal_Storage + "]";
	}

	public OS_Shell(String device_name, int rAM, int internal_Storage) {
		super();
		Device_name = device_name;
		RAM = rAM;
		Internal_Storage = internal_Storage;
	}

	public abstract String TextDefaultApp();
	public abstract String AudioDefaultApp();
	public abstract String VideoDefaultApp();
}
