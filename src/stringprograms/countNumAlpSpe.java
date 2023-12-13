package stringprograms;

public class countNumAlpSpe {

	public static void main(String[] args) {
		String name="123hvajgdu567m&&^%$".toLowerCase();
		int AlphaCount=0;
		int numCount=0;
		int specialCount=0;
		for(int i=0;i<name.length(); i++){
			char ch=name.charAt(i);
			if(ch>='a' && ch<='z'){
				AlphaCount++;
			}
			else if(ch>='0' && ch<='9'){
				numCount++;
			}
			else{
				specialCount++;
			}
		}
	System.out.println("Aplphabets"+"="+AlphaCount+"    "+"Nubers"+"="+numCount+"     "+"specilCharacters"+"="+specialCount);
	}
}
