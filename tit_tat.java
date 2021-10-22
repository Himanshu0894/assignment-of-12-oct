package tit_tat;

import java.util.HashMap;

public class tit_tat {

	public static void main(String[] args) {
		String str = "tit for tat is a proverb";
		HashMap<Character,Integer>map = new HashMap<>();
        for(int i =0;i<=str.length()-1;i++) {
        	Character ch = str.charAt(i);
        	if(ch>='a' && ch<='z') {
        		if(map.containsKey(ch)) {
        			Integer value = map.get(ch);
        			value = value+1;
        			map.put(ch, value);
        			
        		}
        		else {
        			map.put(ch, 1);
        		}
        	}
        }
        int max = 0;
        char chmax =0;
        for(char key:map.keySet()) {
        	if(max<map.get(key)) {
        		max = map.get(key);
        		chmax = key;
        	}
        }
        System.out.println("Max Occurance character is " +chmax +"=" +max);
	}

}
