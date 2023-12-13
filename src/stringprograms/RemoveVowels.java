package stringprograms;

public class RemoveVowels {

	public static void main(String[] args) {

		String name="Lokesh".toLowerCase();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<name.length();i++){
			char ch=name.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' ){
				   sb.append(ch);              
			}
		}
		System.out.println(sb);
	}

}
