import java.util.*;

class srtring_vs_stringBuilder{

	public static void main(String[] args){
		String str = ""  ;
		long start = System.currentTimeMillis();
		for(int i = 0;  i<=100000; i++){
			str += i;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("time taken in String :" + (end - start) );
		
		long start_time = System.currentTimeMillis();
		StringBuilder strin = new StringBuilder();

		for(int i=0 ; i< 100000 ; i++) {
			strin.append(i);
		}
		
		long end_time = System.currentTimeMillis();
		
		System.out.println("Time taken in String Builder :" + (end_time - start_time));

	}
}