package numbersPrograms;

import java.util.Arrays;

public class ZeroToLast {
	public static void main(String[] args) {
		int [] arr={1,0,2,0,3,0,0,4};
		int x=0;
		int []arr2=new int[arr.length];
		int y=arr2.length-1;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr2[x++]=arr[i];
			}
			else{
				arr2[y--]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
