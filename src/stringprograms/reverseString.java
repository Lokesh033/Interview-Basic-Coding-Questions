package stringprograms;

public class reverseString {
public static void main(String[] args) {
	
	String name="hello world";
	String []str=name.split(" ");
	StringBuilder sb=new StringBuilder();
	for(int i=str.length-1; i>=0;i--){
		sb.append(str[i]+" ");
	}
	System.out.println(sb);
}
}
