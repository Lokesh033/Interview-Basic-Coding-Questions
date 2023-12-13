package stringprograms;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = "";
		
		for (int i = 0; i < input.length(); i++) {
			int count = 0;
			char ch = input.charAt(i);
			
			for (int j = 0; j < input.length(); j++) {
				
				if (ch == input.charAt(j)) {
					count++;
				}
			}

			if (count ==1) {
				output = output + ch;
			}
		}
		System.out.println(output);
	}
}
