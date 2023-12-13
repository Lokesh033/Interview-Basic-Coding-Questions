package stringprograms;

import java.util.Arrays;

public class CountCharacterWithoutusingInbuilt {

	public static void main(String[] args) {
		String name="programming";
		int [] arr=new int[256];
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			arr[ch]++;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>1){
				System.out.println((char)i+"="+arr[i]);
			}
		}
		//System.out.println(Arrays.toString(arr));
	}
}
