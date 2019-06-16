package ua.lviv.lgs;

import java.io.ObjectInputStream.GetField;

public class MyException extends Exception{
	
	private String incorrectData;
	
	public MyException(String incorrectData) {
		super(incorrectData);
		this.incorrectData = incorrectData;
	}
	
	public String getIncorrectData() {
		return incorrectData;
	}
}
