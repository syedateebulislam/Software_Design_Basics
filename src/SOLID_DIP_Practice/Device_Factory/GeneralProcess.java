package SOLID_DIP_Practice.Device_Factory;

public abstract class GeneralProcess {
	
	
	protected abstract  void Assemble();
	protected abstract void Test();
	protected abstract void Pack();
	protected abstract void Store();

	public void startMfg() {
			Assemble();
			Test();
			Pack();
			Store();
	}
}
