package stringprograms;

public class Palindrome {

	public static void main(String[] args) {
		String sum="lokesh";
		String copy=sum;
		String str="";
		for(int i=sum.length()-1;i>=0;i--){
			char ch=sum.charAt(i);
			
			str=str+ch;
		}
		
		System.out.println(str);
		
		if(str.equals(copy)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}
}
