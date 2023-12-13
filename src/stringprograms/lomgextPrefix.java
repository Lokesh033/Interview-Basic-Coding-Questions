package stringprograms;

import java.util.Arrays;

public class lomgextPrefix {

	public static void main(String[] args) {
		String[] str = { "flow", "flower", "flowing" };
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		String str1 = str[0];
		String str2 = str[str.length - 1];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length; i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				sb.append(str2.charAt(i));
			}
		}
		System.out.println(sb);
	}
}
