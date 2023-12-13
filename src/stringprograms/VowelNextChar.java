package stringprograms;

public class VowelNextChar {

	public static void main(String[] args) {
		String name="lokesh";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			
			if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u'){
				int str=(int)ch;
				char ch1=(char)(str+1);
				sb.append(ch1);
			}
			else{
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
}
