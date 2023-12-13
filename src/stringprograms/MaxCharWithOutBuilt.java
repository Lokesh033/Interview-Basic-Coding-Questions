package stringprograms;

import java.util.Scanner;

public class MaxCharWithOutBuilt {

	public static void main(String[] args) {
		int max=0;
		char key=' ';
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		int arr[] = new int[256];
		
		for(int i=0; i<name.length();i++){
			char ch=name.charAt(i);
			arr[ch]++;
		}
		for(int i=0;i <arr.length;i++){
			if(arr[i]>max){
				//System.out.println((char)i+"="+arr[i]);
				max=arr[i];
				key=(char)i;
			}
		}
		System.out.println(key+"="+max);
	}
}
