

//Java program to find the unit place digit 
//of the first N natural numbers factorials 
public class AAA { 
  
    //Function to find the unit's and ten's place digit 
    static int get_last_two_digit(long N) 
    { 
  
     // Let us write for cases when 
     // N is smaller than or equal 
     // to 10. 
     if (N <= 10) { 
         long ans = 0, fac = 1; 
         for (int i = 1; i <= N; i++) { 
             fac = fac * i; 
             ans += fac; 
         } 
         return (int)ans % 100; 
     } 
  
     // We know following 
     // (1! + 2! + 3! + 4!...+10!) % 100 = 13 
     else // (N >= 10) 
         return 13; 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
          
        long N = 1; 
         for (N = 1; N <= 10; N++) 
             System.out.println( "For N = " + N 
                  + " : " + get_last_two_digit(N)); 
    } 
  
} 

