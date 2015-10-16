package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestFrame {

	@Test
	public void testFrameScoreisZero() {
		Frame frame1 = new Frame(0,0);
		
		assertEquals(frame1.score(),0);
	}
	
	@Test
	public void testFrameScoreFirstThrow0() {
		Frame frame = new Frame(0,2);
		assertEquals(frame.score(),2);
		frame = new Frame(0,1);
		assertEquals(frame.score(),1);
	}
	
	@Test
	public void testFrameScoreSecondThrow0() {
		Frame frame;
		frame = new Frame(2,0);
		assertEquals(frame.score(),2);
		frame = new Frame(1,0);
		assertEquals(frame.score(),1);
	}
	
}
