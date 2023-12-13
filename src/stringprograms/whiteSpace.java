package stringprograms;

public class whiteSpace {

	public static void main(String[] args) {
		
		String name="hj k ksal dhd lkwdhl  wldhd";
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<name.length(); i++){
			char ch=name.charAt(i);
			if(ch!=' '){
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
}
