package stringprograms;

public class SpecialChar {

	public static void main(String[] args) {
		
		String name="jhqgw&*%&^#1111gt".toLowerCase();
		int sum=0;
	
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<name.length();i++){
			char ch=name.charAt(i);
			if(ch>='0' && ch<='9'){
				
				int value=ch-'0';
				sum=sum+value;
			}
		}
			System.out.println(sum);
	}

}
