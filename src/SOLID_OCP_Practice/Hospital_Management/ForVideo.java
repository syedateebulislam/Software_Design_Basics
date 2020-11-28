package SOLID_OCP_Practice.Hospital_Management;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import SOLID_OCP_Practice.MobileOS.Realme;

class ForVideo {

	@Test
	void test() {
//		fail("Not yet implemented");
		Realme realmeTest = new Realme("Realme", 6, 128);
		String result=realmeTest.VideoDefaultApp();
		assertEquals("Realme default video player app in use...", result);
	}
}
