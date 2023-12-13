package numbersPrograms;

public class AmstrongNumber {

	 public static void main(String[] args) {
	        int num = 153;
	        int sum = 0;
	        int copy = num;

	        while (num != 0) {
	            int rem = num % 10;
	            sum = sum + power(rem, countDigits(copy));
	            num = num / 10;
	        }

	        if (sum == copy) {
	            System.out.println("Armstrong Number");
	        } else {
	            System.out.println("Not an Armstrong Number");
	        }
	    }

	    private static int countDigits(int num) {
	        int count = 0;
	        while (num != 0) {
	            num = num / 10;
	            count++;
	        }
	        return count;
	    }

	    public static int power(int base, int exponent) {
	        int result = 1;
	        while (exponent != 0) {
	            result = result * base;
	            exponent--;
	        }
	        return result;
	    }
}
