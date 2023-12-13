package numbersPrograms;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int [] arr1={1,2,3,4,5};
		int []arr2={6,7,8,9};
		
		int [] ans=new int[arr1.length+arr2.length];
		int x=0;
		for(int i=0;i<arr1.length;i++){
			ans[x++]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++){
			ans[x++]=arr2[j];
		}
		System.out.println(Arrays.toString(ans));
	}
}
