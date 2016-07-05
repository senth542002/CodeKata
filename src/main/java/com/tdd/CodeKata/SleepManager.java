package com.tdd.CodeKata;

public class SleepManager {

	public boolean sleepIn(boolean isWeekDay, boolean isvacation) {
		if(!isWeekDay || isvacation){
			return true;
		}
		return false;
	}

}
