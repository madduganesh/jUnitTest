package junitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addStrings ("capstone", "project");
		assertEquals("capstoneproject", result);
		
	}

}
