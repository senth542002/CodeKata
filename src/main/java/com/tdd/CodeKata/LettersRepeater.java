package com.tdd.CodeKata;

public class LettersRepeater {

	public String identifyAndRepeatLettersFor(String word, int repeatNumber) {
		return repeatListOfLetters(repeatNumber, identifyTheLettersFor(word, repeatNumber));
	}

	protected String repeatListOfLetters(int repeatNumber, String identifiedLetters) {
		String repeatedString = "";
		for(int i = 1; i <= repeatNumber; i++){
			repeatedString = repeatedString+identifiedLetters;
		}
		return repeatedString;
	}

	protected String identifyTheLettersFor(String word, int repeatNumber) {
		return word.substring((getWordLength(word)-repeatNumber), getWordLength(word));
	}

	private int getWordLength(String word) {
		return word.length();
	}

}
