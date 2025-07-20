import java.util.*;

public class atoi {
    public int myAtoi(String s) {
        // code here    
        if(s == null || s.length() ==0){
            return 0;
        }
        
        int i = 0 ;
        int n = s.length() ;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        long res = 0;
        
        while(i < n && s.charAt(i) == ' ') i++;
        
        if( i== n) return 0;
        
        int sign  = 1;
        
        if(s.charAt(i) == '+') i++;
        else if( s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        
        while(i < n && Character.isDigit(s.charAt(  i))){
            int digit = s.charAt(i)   - '0';
            res = res *10 +  digit;
            
            if(sign * res <= min) return min   ;
            if(sign * res >= max) return max          ; 
            
            i++;
        }
        
        return (int) (sign * res);
    }

}
