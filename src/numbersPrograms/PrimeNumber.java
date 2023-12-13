package numbersPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n=10;
		for(int i=1;i<n;i++){
		int	num=i;
		boolean flag=true;
		for(int j=2;j<num; j++){
			if(num%j==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println(num);
		}
		}
		
	}
}
