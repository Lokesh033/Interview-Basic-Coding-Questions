package stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MaxCharacterrepeated {
	public static void main(String[] args) {
		
	int max=0;
	Scanner sc= new Scanner(System.in);
	String name=sc.nextLine();
	
	char out=' ';
	Map<Character, Integer> map=new HashMap<Character, Integer>();
	
	for(char ch: name.toCharArray()){
		
		map.put(ch,map.getOrDefault(ch, 0)+1);
	}
	for(char key: map.keySet()){
		int count=map.get(key);
		
		if(count>max){
			max=count;
			out=key;
			
		}
		
	}
	System.out.println(out+"="+max);
	
//	for(Entry<Character, Integer> set: map.entrySet()){
//		if(set.getValue()>max){
//			max=set.getValue();
//			System.out.println(set.getKey()+"="+set.getValue());
//		}
	}
}
