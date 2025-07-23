import java.util.*;

class operator{
	public static void main(String[] args){
		int a  = 2;
		int b = 10;
		
		System.out.println("a : "+ Integer.toBinaryString(a) +   "     "    +   a     );
		System.out.println("  B :  " +Integer. toBinaryString(b)  + "      " +        b );

		System.out.println("a & b :"   +      (   a  & b  ) );
		System.out.println("a | b : "  + (a | b));
		System.out.println("a ^ b  : " + (a^b) );
		System.out.println("~a : "   + (~a))  ;

		System.out.println(" a << 1 : "  + (b <<1));
		System.out.println(" a >> 1   :" + (a >> 1));



		
	}
}