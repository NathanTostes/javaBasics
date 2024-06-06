package BigInteger;

import java.math.BigInteger;

public class BigIntegers {
	public static void main(String[] args) {
		System.out.println(calculateFatorial(1000));
	}
	
	public static BigInteger calculateFatorial(int num) {
		BigInteger bigNum = BigInteger.valueOf(1);
		for(int i = 2; i <= num; i++) {
			bigNum = bigNum.multiply(BigInteger.valueOf(i));
		}
		return bigNum;
	}
}