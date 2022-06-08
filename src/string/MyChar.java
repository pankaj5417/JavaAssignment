package string;

public class MyChar {
private char ch;
MyChar(char ch){
	this.ch=Character.toLowerCase(ch);
}

public boolean isVowel() {
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		return true;
	}
	return false;
}

public boolean isAlphabet() {
	if(Character.isLetter(ch))
	return true;
	return false;
}
}
