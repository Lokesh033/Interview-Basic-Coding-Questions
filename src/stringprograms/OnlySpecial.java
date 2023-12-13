package stringprograms;

public class OnlySpecial {

	public static void main(String[] args) {
		
		String name="wdgy(^**%214234";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			if(!Character.isLetterOrDigit(ch)&& !Character.isWhitespace(ch)){
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
}
