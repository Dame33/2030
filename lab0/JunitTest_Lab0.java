package lab0;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitTest_Lab0 {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void testStudentNo() {
		String myId = Lab0.getMyID();
		boolean correct = false;
		correct = myId.length() == 9 ? true : false;
		assertTrue("Your student id does not contain 9 digits", correct);
	}
	
	@Test
	public void test_02_01() {
		
		String letterGrade = Lab0.getLetterGrade(93.00); 
		boolean correct = false;
		String expected = "A+"; 
		correct = letterGrade.compareTo(expected) == 0 ? true : false;
		assertTrue(expected + " grade is not computed correctly!", correct );
	}
	
	//write test cases for the corresponding grade values
	
}
