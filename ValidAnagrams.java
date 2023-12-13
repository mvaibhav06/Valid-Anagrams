import java.util.HashMap;

public class ValidAnagrams {
	
	public static boolean isAnagram(String s, String t) {
		
		if(s.length() != t.length()) return false;
		
		if(s.equals(t)) return true;
		
		HashMap<Character, Integer> input = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) {
			
			if(input.containsKey(s.charAt(i))) {
				input.put(s.charAt(i), input.get(s.charAt(i))+1 );
			}else {
				input.put(s.charAt(i), 1);
			}
		}
		
		for(int j=0; j<t.length(); j++) {
			if(input.containsKey(t.charAt(j))) {
				input.put(t.charAt(j), input.get(t.charAt(j))-1 );
			}else {
				return false;
			}
		}
		
		for(int val: input.values()) {
			if(val>0) {
				return false;
			}else {
				continue;
			}
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		isAnagram("anagram", "nagaram");
	}

}
