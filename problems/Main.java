import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int org = n;
		int ln = String.valueOf(n).length();
		int res = 0;
		
		while(n != 0 )  {
			int b = n % 10;
			res = res + (int ) Math.pow(b , ln);
			n = n/10;
			 
		}
		if(res == org){
			System.out.println("Aramstrong number");	
		}
		else{
			System.out.println("Not an Aramstrong number");	
		}
	}
}