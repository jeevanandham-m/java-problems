import java.util.*;

class Hars{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in) ; 
		

		int n = sc.nextInt();
		int res = 0 ; 
		int org = n;
while(n !=0){
	res = res +  (n %10);

		

		

	


	n = n /10;
}

if(org % res  == 0){
		System.out.println("Harsad number");
} 


else{
	System.out.println("Not a harsad                number" ) ;

}
	}
}