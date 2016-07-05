package com.tdd.CodeKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class ManageHelloName {

	
	@Test
	public void addHelloAtTheStartAndExclamationAtTheEndOfAGivenWord() throws Exception {
		ManageName manageName = new ManageName();
		String finalName = manageName.appendHelloTo("Bob");
		assertEquals("Hello Bob!", finalName);
	}
	
	

}
