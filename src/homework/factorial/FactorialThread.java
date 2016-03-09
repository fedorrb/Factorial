package homework.factorial;

import java.security.InvalidParameterException;

public class FactorialThread implements Runnable{
	
	private int value;
	private Thread tr;
	
	public FactorialThread(int value) {
		super();
		this.value = value;
		tr = new Thread(this);
		tr.start();
	}	
	
	@Override
	public void run() {
		try{
		System.out.println("Thread " + value + " = " + FactorialUtil.factorial(value));
		}
		catch (InvalidParameterException e){
			System.out.println("Factorial of a negative number is not defined.");
		}
	}

}
