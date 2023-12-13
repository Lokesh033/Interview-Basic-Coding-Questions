package stringprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String name="dog";
		String name1="god";
		char [] n1=name.toCharArray();
		char [] n2=name1.toCharArray();
		Arrays.sort(n1);
		Arrays.sort(n2);
		boolean flag = true;
		for(int i=0,j=0;i<n1.length;i++,j++){
			
			if(n1[i]!=n2[j]){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println("Anagram");
		}
		else{
			System.out.println("not a anagram");
		}
	}
}
