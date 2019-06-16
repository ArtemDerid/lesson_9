package ua.lviv.lgs;

public class Main {
	public static void main(String[] args) throws IllegalAccessException, MyException {
		Methods m = new Methods(-2, -4);
		
		m.add();
		m.divide();
		m.multiply();
		m.subtract();
	}
}
