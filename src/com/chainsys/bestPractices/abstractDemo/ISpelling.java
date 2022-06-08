package com.chainsys.bestPractices.abstractDemo;

public interface ISpelling {
	void spellCheck(String word); // Must be implemented by all languages.
	void checkGrammar(String sentence); // Must be implemented by all languages.
	int wordCount(String sentence); // The logic is same for all language.
}
abstract class Language implements ISpelling{
	@Override
	public int wordCount(String sentence) {
		String [] words = sentence.split(" ");
		return words.length;
	}
}
class EnglishLanguage extends Language implements ISpelling{

	@Override
	public void spellCheck(String word) {
		System.out.println("English spell checker");
	}

	@Override
	public void checkGrammar(String sentence) {
		System.out.println("English Grammar checker");
	}

	
	
}

class TamilLanguage extends Language implements ISpelling{

	@Override
	public void spellCheck(String word) {
		System.out.println("Tamil spell checker");
	}

	@Override
	public void checkGrammar(String sentence) {
		System.out.println("Tamil Grammar checker");
	}

}

class FrenchLanguage extends Language implements ISpelling{

	@Override
	public void spellCheck(String word) {
		System.out.println("French spell checker");
	}

	@Override
	public void checkGrammar(String sentence) {
		System.out.println("French Grammar checker");
	}

}