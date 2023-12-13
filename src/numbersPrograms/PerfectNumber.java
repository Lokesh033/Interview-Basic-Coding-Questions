package numbersPrograms;

public class PerfectNumber {
	public static void main(String[] args) {

		int sum = 0;
		int num = 6;
		int copy = num;
		for (int i = 1; i <= num / 2; i++) {

			if (num % i == 0) {

				sum = sum + i;
			}

		}

		if (sum == num) {
			System.out.println("perfect numbers");
		} else {
			System.out.println("not perfect numbers");
		}
	}
}
