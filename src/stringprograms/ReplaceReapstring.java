package stringprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class ReplaceReapstring {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		String name=sc.next();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<name.length();i++){
			int count=0;
			for(int j=0;j<name.length();j++){
				if(name.charAt(i)==name.charAt(j)){
					count++;
				}
			}
			if(count==1){
				sb.append('$');
			}
			
			else{
				sb.append(name.charAt(i));
			}
	}
		System.out.println(sb);
	}
	}
