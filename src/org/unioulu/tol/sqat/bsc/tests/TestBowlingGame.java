package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;


public class TestBowlingGame {

	static Frame[] frames = {
		new Frame(1,5), new Frame(3,6),new Frame(7,2), new Frame(3,6), new Frame(4,4),
		new Frame(5,3),new Frame(3,3), new Frame(4,5), new Frame(8,1), new Frame(2,6)
	};
	
	@Test
	public void testFrameScore() {
		BowlingGame game = null;
		game = new BowlingGame();
		
		for(Frame frame: frames) {
			game.addFrame(frame);
		}
	}
	
	@Test
	public void t() {
		fail("Not yet implemented");
	}
}
