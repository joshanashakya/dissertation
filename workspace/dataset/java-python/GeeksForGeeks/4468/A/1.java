

// Java program find MDAS_Factorial 
import java.util.*; 
  
class Count { 
    public static int MDAS_Factorial(int N) 
    { 
        if (N <= 2) 
            return N; 
  
        if (N <= 4) 
            return (N + 3); 
  
        if ((N - 4) % 4 == 0) 
            return (N + 1); 
  
        else if ((N - 4) % 4 <= 2) 
            return (N + 2); 
  
        else
            return (N - 1); 
    } 
  
    public static void main(String[] args) 
    { 
        int N = 4; 
        System.out.println(MDAS_Factorial(N)); 
  
        N = 10; 
        System.out.println(MDAS_Factorial(N)); 
    } 
} 

