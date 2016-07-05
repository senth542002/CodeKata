package com.tdd.CodeKata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RepeatsTheLastNCharectorsOfTheWordNTimes {
	

	private LettersRepeater lettersRepeater;
	
	@Before
	public void initialize(){
		lettersRepeater = new LettersRepeater();		
	}
	
	@Test
	public void identifyTheLettersToBeRepeated() throws Exception {
		String identifiedLetters = lettersRepeater.identifyTheLettersFor("Hello",1);
		assertEquals("o", identifiedLetters );
	}
	
	@Test
	public void repeatLastOneCharecterOneTimeForHello() {
		String repeatedletter = lettersRepeater.identifyAndRepeatLettersFor("Hello",1);
		assertEquals("o", repeatedletter);
	}
	
	@Test
	public void repeatLastTwoCharecterTwoTimesForHello() {
		String repeatedletter = lettersRepeater.identifyAndRepeatLettersFor("Hello",2);
		assertEquals("lolo", repeatedletter);
	}
	
	@Test
	public void repeatLastThreeCharectersThreeTimesForHello() {
		String repeatedletter = lettersRepeater.identifyAndRepeatLettersFor("Hello",3);
		assertEquals("llollollo", repeatedletter);
	}
}
