package algorithm.math;

public final class MathUtil {
	private MathUtil() {
	}

	public static boolean isPrime(int number) {
		if (number < 0) {
			throw new IllegalArgumentException();
		}

		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
