package stringprograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountDuplicates {

	public static void main(String[] args) {
		
		String name="padmashree";
		int count=0;
		HashMap<Character, Integer> map= new HashMap<>();
		char []ch=name.toCharArray();
		for(char chr: ch){
//			if(!map.containsKey(chr)){
//				map.put(chr,map.getOrDefault(chr, 0)+1);
//			}
			map.put(chr,map.getOrDefault(chr, 0)+1);
		}
		for(Entry<Character, Integer> entry: map.entrySet()){
			if(entry.getValue()>1){
				System.out.println(entry);
			}
		}
		for(Character key: map.keySet()){
			//System.out.println(key);
			//System.out.println(map.keySet());
			
			int count1=map.get(key);
			if(count1>1){
				
				System.out.println(key+ "="+count1);
			}
		}
	}
}
