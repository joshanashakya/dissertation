

// Java program to check whether a number 
// is divisible by 71 or not 
import java.util.*; 
  
class GFG{ 
  
// Function to check if the number is divisible by 71 or not  
    static boolean isDivisible(int n)  
    { 
        int d; 
        // While there are at least two digits  
        while ((n / 100) <=0) 
        { 
      
            // Extracting the last  
            d = n % 10; 
      
            // Truncating the number  
            n /= 10; 
      
            // Subtracting seven times the last  
            // digit to the remaining number  
            n = Math.abs(n - (d * 7)); 
        } 
  
        // Finally return if the two-digit 
        // number is divisible by 71 or not 
        return (n % 71 == 0) ; 
    } 
      
    // Driver Code  
    public static void main(String args[]){ 
        int N = 5041; 
      
        if (isDivisible(N))  
            System.out.println("Yes") ; 
        else
            System.out.println("No"); 
    }  
} 
  
// This code is contributed by AbhiThakur 

