package numbersPrograms;

public class Numberpalindrome {

	public static void main(String[] args) {

		int num=123;
		int copy=num;
		int ans=0;
		while(num!=0){
			int rem=num%10;
			ans=ans*10+rem;
			num=num/10;
		}
		if(ans==copy){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not Palindrome");
		}
	}

}
