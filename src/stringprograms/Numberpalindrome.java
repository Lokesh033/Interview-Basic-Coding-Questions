package stringprograms;

public class Numberpalindrome {

	public static void main(String[] args) {
		
	
	int num=121;
	int copy=num;
	int rev=0;
	int rem=0;
	while(num!=0){
		rem=num%10;
		rev=rem+rev*10;
		num=num/10;
	}
	if(rev==copy){
		System.out.println("palindrome");
	}
	else{
		System.out.println("not a palindrome");
	}
}
}
