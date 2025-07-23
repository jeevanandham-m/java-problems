import java.util.*;
class my_string{
	public static void main(String[] args){

		String str = "  Lokesh  ";
		String s  = "  lokesh  ";

		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.trim());
		System.out.println(str.equals(  s));
		System.out.println(str.equalsIgnoreCase(s));
		System.out.println(str.substring(2 , 4));
		System.out.println(str.replace('o' , 'a'));

	}

}