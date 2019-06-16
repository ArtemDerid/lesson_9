package ua.lviv.lgs;

public class Methods {
	
	private int firstNumber;
	private int secondNumber;
	
	public Methods(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public void add() throws IllegalAccessException, MyException {
		System.out.println(firstNumber+secondNumber);
		if(firstNumber<0 && secondNumber<0) {
			throw new IllegalArgumentException();
		}
		if(firstNumber == 0 && secondNumber != 0 || firstNumber != 0 && secondNumber == 0) {
			throw new ArithmeticException();
		}
		if(firstNumber == 0 && secondNumber == 0) {
			throw new IllegalAccessException();
		}
		if(firstNumber > 0 && secondNumber > 0) {
			throw new MyException("It's my exception");
		}
	}
	
	public void subtract() throws IllegalAccessException, MyException {
		System.out.println(firstNumber-secondNumber);
		if(firstNumber<0 && secondNumber<0) {
			throw new IllegalArgumentException();
		}
		if(firstNumber == 0 && secondNumber != 0 || firstNumber != 0 && secondNumber == 0) {
			throw new ArithmeticException();
		}
		if(firstNumber == 0 && secondNumber == 0) {
			throw new IllegalAccessException();
		}
		if(firstNumber > 0 && secondNumber > 0) {
			throw new MyException("It's my exception");
		}
	}
	
	public void multiply() throws IllegalAccessException, MyException {
		System.out.println(firstNumber*secondNumber);
		if(firstNumber<0 && secondNumber<0) {
			throw new IllegalArgumentException();
		}
		if(firstNumber == 0 && secondNumber != 0 || firstNumber != 0 && secondNumber == 0) {
			throw new ArithmeticException();
		}
		if(firstNumber == 0 && secondNumber == 0) {
			throw new IllegalAccessException();
		}
		if(firstNumber > 0 && secondNumber > 0) {
			throw new MyException("It's my exception");
		}
	}
	
	public void divide() throws IllegalAccessException, MyException {
		System.out.println(firstNumber/secondNumber);
		if(firstNumber<0 && secondNumber<0) {
			throw new IllegalArgumentException();
		}
		if(firstNumber == 0 && secondNumber != 0 || firstNumber != 0 && secondNumber == 0) {
			throw new ArithmeticException();
		}
		if(firstNumber == 0 && secondNumber == 0) {
			throw new IllegalAccessException();
		}
		if(firstNumber > 0 && secondNumber > 0) {
			throw new MyException("It's my exception");
		}
	}
}
