package SOLID_OCP_Practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import SOLID_OCP_Practice.MobileOS.Realme;

public class ForText {

	@Test
	void test() {
//		fail("Not yet implemented");
		Realme realmeTest = new Realme("Realme", 6, 128);
		String result=realmeTest.TextDefaultApp();
		assertEquals("Realme default text messaging app in use...", result);
	}
}
