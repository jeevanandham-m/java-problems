import java.util.Scanner;

public class string_contains {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.nextLine();
        // StringBuilder sb = new StringBuilder();

        
        // for(int i = 1 ; i <= s1.length() ; i++){
        //     sb.append(s1.charAt(i % s1.length()));
        //     if(sb.equals(s2)){
        //         System.out.println("True");
        //         return;
        //     }
            
        // }
        // System.out.println("False");

       String result =  (s1+s1).contains(s2) ? "True" : "False";
       System.out.println(result);
    }
}
