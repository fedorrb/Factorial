package homework.factorial;

import java.math.BigInteger;
import java.security.InvalidParameterException;

public class FactorialUtil {
	/**
	 * @param n
	 * @return factorial(n)
	 */
	public static BigInteger factorial(int n) throws InvalidParameterException {
		if (n < 0) {
			throw new InvalidParameterException("Factorial of a negative number is not defined.");
		}
		BigInteger ret = BigInteger.ONE;
		if (n >= 0) {
			for (int i = 1; i <= n; ++i)
				ret = ret.multiply(BigInteger.valueOf(i));
		}
		return ret;
	}

	@TestFunc(n = 5, check = true)
	public static boolean testFactorial(int n, boolean check) {
		boolean result = true;
		if (check) {
			if (factorial(0).compareTo(BigInteger.ONE) != 0)
				result = false;
			if (factorial(1).compareTo(BigInteger.ONE) != 0)
				result = false;
		}
		if (result) {
			if (factorial(n).compareTo(BigInteger.valueOf(120)) != 0)
				result = false;
		}
		return result;
	}
}
