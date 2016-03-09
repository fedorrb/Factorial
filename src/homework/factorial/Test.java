package homework.factorial;

public class Test {

	/**
	 * function starts threads to calculating the factorial
	 * @param start initial value
	 * @param count number of threads
	 */
	public void calcFactorial(int start, int count) {
		if (count > 0) {
			int end = start + count;
			while(start < end){
				new Thread(new FactorialThread(start));
				start++;
			}
		}
	}
}
