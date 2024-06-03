package Lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.Timeout;

class tester {
	public Timeout globalTimeout = Timeout.seconds(1);
	public static TestingExample Test = new TestingExample();

	@Test
    public void test1() {
        assertEquals(-1, TestingExample.LicencePoints(-50, -50, false));
        /**
         * when both negative
         */
    }
    @Test
    public void test2() {
        assertEquals(-1, TestingExample.LicencePoints(-50, 50, false));
        /**
         * when actual speed negative
         */
    }
    @Test
    public void test3() {
        assertEquals(-1, TestingExample.LicencePoints(50, -50, false));
        /**
         * when max speed negative
         */
    }
    @Test
    public void test4() {
        assertEquals(-1, TestingExample.LicencePoints(30,50,false));
        /**
         * when Actual Speed minus max speed is negative
         */
    }
    @Test
    public void test5() {
    	assertEquals(0, TestingExample.LicencePoints(30,30,false));
    	/**
    	 * when max speed equals actual speed
    	 */
    }
    @Test
    public void test6() {
    	assertEquals(6,TestingExample.LicencePoints(100,20,true));
    	/**
    	 * when stunt driving is true and actual speed minus max speed is > 50
    	 */
    }
    @Test
    public void test7() {
    	assertEquals(6,TestingExample.LicencePoints(100, 60, true));
    	/** 
    	 * when stunt driving true
    	 */
    }

    @Test
    public void test8() {
    	assertEquals(6,TestingExample.LicencePoints(100,20,false));
    	/**
    	 * when stunt driving false, but acc speed - max speed > 50
    	 */   
    }
    @Test
    public void test17() {
    	assertEquals(-1,TestingExample.LicencePoints(20, 100, true));
    	/**
    	 * when speed acc speed - max speed but stunt driving true, not possible
    	 */
    }
    @Test
    public void test9() {
    	assertEquals(4,TestingExample.LicencePoints(50,10,false));
    	/**
    	 * equals 40, between 30 and 49
    	 */
    }
    @Test
    public void test10() {
    	assertEquals(4,TestingExample.LicencePoints(50,20,false));
    	/**
    	 * equals 30
    	 */
    }
    @Test
    public void test11() {
    	assertEquals(4,TestingExample.LicencePoints(100,51,false));
    	/**
    	 * equals 49
    	 */
    }
    @Test
    public void test12() {
    	assertEquals(3,TestingExample.LicencePoints(30,10,false));
    	/**
    	 * equals 20, between 16 and 29
    	 */
    }
    @Test
    public void test13() {
    	assertEquals(3,TestingExample.LicencePoints(30,14,false));
    	/** 
    	 * equals 16
    	 */
    }
    @Test
    public void test14() {
    	assertEquals(3,TestingExample.LicencePoints(50,21,false));
    	/**
    	 * equals 29
    	 */
    }
    @Test
    public void test15() {
    	assertEquals(6,TestingExample.LicencePoints(100,50,false));
    	/**
    	 * equals 50
    	 */
    }
    @Test
    public void test16() {
    	assertEquals(0,TestingExample.LicencePoints(30,15, false));
    }
}
