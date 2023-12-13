package numbersPrograms;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=145;
		
		int sum=0;
		int copy=num;
		while(num!=0){
			int fact =1;
			int rem =num%10;
			for(int i=rem; i>0;i--){
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==copy){
			System.out.println("stromg number");
		}
		else{
			System.out.println("not a Stromg number");
		}
		
	}

}
