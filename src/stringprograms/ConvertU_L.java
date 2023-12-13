package stringprograms;

import java.util.Scanner;

public class ConvertU_L {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<name.length();i++){
			char ch=name.charAt(i);
			
			int num=(int)ch;
			char chr=(char)(num-32);// (num+32)--->Bigger to smaller
			sb.append(chr);
		}
		System.out.println(sb);
	}
}
