
package recursiveFibonacci;

class Fibonacci {
	public static int calculateFibonacci(int orderNum) {
		if (orderNum <= 2) {
			return 1;
		} else {
			return calculateFibonacci(orderNum - 1) + calculateFibonacci(orderNum - 2);
		}
	}
}
