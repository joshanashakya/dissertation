

// Java Program to find alternate sum  
// of Fibonacci numbers  
  
public class GFG { 
      
    //Computes value of first fibonacci numbers  
    // and stores their alternate sum  
    static double calculateAlternateSum(int n)  
    {  
        if (n <= 0)  
            return 0;  
        
        int fibo[] = new int [n + 1];  
        fibo[0] = 0; 
        fibo[1] = 1;  
        
        // Initialize result  
        double sum = Math.pow(fibo[0], 2) + Math.pow(fibo[1], 2);  
        
        // Add remaining terms  
        for (int i = 2; i <= n; i++) {  
            fibo[i] = fibo[i - 1] + fibo[i - 2];  
        
            // For even terms  
            if (i % 2 == 0)  
                sum -= fibo[i];  
        
            // For odd terms  
            else
                sum += fibo[i];  
        }  
        
        // Return the alternating sum  
        return sum;  
    }  
        
      
    // Driver code 
    public static void main(String args[]) 
    { 
        // Get n  
        int n = 8;  
        
        // Find the alternating sum  
        System.out.println("Alternating Fibonacci Sum upto "
              + n + " terms: "
              + calculateAlternateSum(n));  
        
    } 
    // This Code is contributed by ANKITRAI1 
} 

