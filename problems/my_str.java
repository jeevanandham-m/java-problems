import java.util.*;

class my_str{
	public static void main(String [] args){
		String str = "122333";
		Map<Character ,  Integer> map = new HashMap<>();
		for(char ch : str.toCharArray()){
			map.put(ch , map.getOrDefault(ch , 0 ) + 1);	
		}
		for(Map.Entry<Character , Integer> entry : map.entrySet()){
			if(entry.getValue() > 1){
				System.out.println(entry.getValue() * (  entry.getKey() - '0' ) ); 
   			}	
		}
	}
}