package stringprograms;

import java.util.HashMap;

public class StringChar {

	public static void main(String[] args) {
		String name="aaabbCchh".toLowerCase();
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			if(map.containsKey(ch)){
				int count=map.get(ch);
				count++;
				map.replace(ch,count );
			}
			else{
				map.put(ch, 1);
			}
			
			//	map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		for(char key:map.keySet()){
			int count=map.get(key);
			System.out.print(count+""+key);
		}
	}
}
