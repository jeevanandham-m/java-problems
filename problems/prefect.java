import java.util.*     ;  
class prefect{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i < n ; i++)    {
			if(n %  i == 0 ){	
				sum = sum + i;
			}
		}

		if(sum == n){
		
		System.out.println("Perfect number");
		}else{
			System.out.println("is not a prefect number");
		}
	}
}