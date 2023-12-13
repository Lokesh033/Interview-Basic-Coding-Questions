package stringprograms;



public class NumberString {

	public static void main(String[] args) {
		String name="2A3B7C";
		StringBuilder sb=new StringBuilder();
		char [] ch=name.toCharArray();
		for(int i=0;i<name.length();i++){
			
			if(Character.isDigit(ch[i])){
				int value=ch[i]-'0';
				for(int j=0;j<value;j++){
					sb.append(ch[i+1]);
				}
			}
		}
		System.out.println(sb);
		
	}
}
