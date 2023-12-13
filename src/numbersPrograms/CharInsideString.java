package numbersPrograms;

import java.util.Scanner;

public class CharInsideString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str1="Hello Padmashree";
		String str2=sc.next();
		
		boolean result=getTest(str1,str2);
			System.out.println(result);
	
	}

	private static boolean getTest(String str1, String str2) {
		
		char [] ch1=str1.toCharArray();
		char [] ch2=str2.toCharArray();
		
		for(int i=0;i<ch1.length;i++){
			int count=0;
			for(int j=0; j<ch2.length && i+j<ch1.length;j++){
				if(ch1[i+j]!=ch2[j]){
					break;
				}
				count++;
			}
			if(count==str2.length()){
				return true;
			}
		}
		
		return false;
	}

}
