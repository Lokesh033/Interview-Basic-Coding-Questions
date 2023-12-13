package numbersPrograms;

public class MaximumNum {

	public static void main(String[] args) {
		int [] arr={123,4,545,545,56565,576};
		int max1=0;
		int max2=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max1){
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2 && arr[i]<max1){
				max2=arr[i];
			}
		}
		System.out.println(max2);
	}
}
