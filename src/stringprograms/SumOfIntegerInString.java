package stringprograms;

public class SumOfIntegerInString {

	public static void main(String[] args) {
		String name="KA02KR5408".toLowerCase();
		int sum=0;
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			
			if(ch>='0' && ch<='9'){
				int value=(int)(ch-48);
				sum=sum+value;
			}
		}
		System.out.println(sum);
	}
}
