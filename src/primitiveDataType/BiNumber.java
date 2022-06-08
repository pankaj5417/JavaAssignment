package primitiveDataType;

public class BiNumber {
	private int number1;
	private int number2;
	
	BiNumber(int num1,int num2){
		number1=num1;
		number2=num2;
		
	}
	
	public int add() {
		return number1+number2;
	}
	
	public int multiply() {
		return number1*number2;
	}
	
	public void doubleValue() {
		number1=number1*2;
		number2=number2*2;
	}
	
	public int getNumber1() {
		return number1;
		
	}
	
	public int getNumber2() {
		return number2;
		
	}
}
