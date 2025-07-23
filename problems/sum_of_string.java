import java.util.*;

class sum_of_string{


public static void main(String[] args){
		String s = "123Lo";
		for(char i : s.toCharArray()){
			System.out.println(i - '0');
			System.out.println(i - 'o');
		}
	}
}