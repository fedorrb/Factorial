package homework.factorial;

import java.math.BigInteger;
import java.security.InvalidParameterException;

public class FactorialUtil {
	/**
	 * @param n
	 * @return factorial(n)
	 */
	public static BigInteger factorial(int n) throws InvalidParameterException{
		if(n < 0)
			throw new InvalidParameterException();
		BigInteger ret = BigInteger.ONE;
		if (n >= 0) {
			for (int i = 1; i <= n; ++i)
				ret = ret.multiply(BigInteger.valueOf(i));
		}
		return ret;
	}
}
