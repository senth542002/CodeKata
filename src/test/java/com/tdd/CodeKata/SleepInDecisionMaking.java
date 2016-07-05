package com.tdd.CodeKata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SleepInDecisionMaking {
	
	private SleepManager sleepManager;
	
	@Before
	public void initialize(){
		sleepManager = new SleepManager();		
	}
	
	@Test
	public void sleepInIfNotAWeelDayAndNotAVacation() throws Exception {
		assertTrue(sleepManager.sleepIn(false,false));
	}

	@Test
	public void doNotsleepInIfAWeekDayAndNotAVacation() throws Exception {
		assertFalse(sleepManager.sleepIn(true,false));
	}
	
	@Test
	public void sleepInIfNotAWeekDayAndAVacation() throws Exception {
		assertTrue(sleepManager.sleepIn(false,true));
	}
	
	@Test
	public void sleepInIfAWeekDayAndAVacation() throws Exception {
		assertTrue(sleepManager.sleepIn(true,true));
	}
}
