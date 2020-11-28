package SOLID_ISP_Practice;

import java.util.Random;

public class Ticket {
	private int Num;
	private int Val;
	
	public Ticket(int num, int val) {
		super();
		Random r=new Random();
		int Num= r.nextInt(100);
		setNum(Num);
		Val = val;
	}
	
	public void setNum(int num) {
		Num = num;
	}
	public int getNum() {
		return Num;
	}
	public int getVal() {
		return Val;
	}
	public void setVal(int val) {
		this.Val = val;
	}
	@Override
	public String toString() {
		return "Ticket [Num=" + Num + ", Val=" + Val + "]";
	}
}