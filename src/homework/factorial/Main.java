package homework.factorial;

public class Main {

	public static void main(String[] args) {
		Test test = new Test();
		test.calcFactorial(1, 100);
	}
	/*
	 * check results in Python
	import sys
	import math
	def factorial(x):
	    if x == 0:
	        return 1
	    else:
	        return x * factorial(x - 1)
	for i in range (101):
	    print str(i) + " = " +  str(factorial(i))
	    */
}
