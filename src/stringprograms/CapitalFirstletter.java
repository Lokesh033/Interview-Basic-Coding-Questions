package stringprograms;

public class CapitalFirstletter {

	public static void main(String[] args) {
		String name=" hello world";
		String str="";
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			
			if(ch==' '){
				str=str+ch;
				i++;
				char ch1=name.charAt(i);
				str=str+Character.toUpperCase(ch1);
				
			}
			else{
				str=str+ch;
			}
		}
		System.out.println(str);
}}
