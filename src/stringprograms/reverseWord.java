package stringprograms;

import java.util.Scanner;

public class reverseWord {
	public static void main(String[] args) {

		String name = "hello world";
		String word = "";
		String revstr = "";

		for (int i = 0; i < name.length(); i++) {
			char ch=name.charAt(i);
			if(ch!=' '){
				word=ch+word;
			}
			else{
				revstr=word+" "+revstr;
				word="";
			}
		}
		revstr=word+" "+revstr;
		System.out.println(revstr);
	}
}
