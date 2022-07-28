

// Java program to check if the given 
// number is Ore number 
  
import java.util.*; 
class GFG { 
  
    static Vector<Integer> arr = new Vector<Integer>(); 
  
    // Function that returns harmonic mean. 
    static void generateDivisors(int n) 
    { 
        // Note that this loop runs till square root 
        for (int i = 1; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) { 
  
                // If divisors are equal, store 'i' 
                if (n / i == i) 
                    arr.add(i); 
  
                else // Otherwise store 'i' and 'n/i' both 
                { 
                    arr.add(i); 
                    arr.add(n / i); 
                } 
            } 
        } 
    } 
  
    // Utility function to calculate harmonic mean 
    // of the divisors 
    static double harmonicMean(int n) 
    { 
        generateDivisors(n); 
  
        // Declare sum variables and initialize 
        // with zero. 
  
        double sum = 0.0; 
  
        int len = arr.size(); 
  
        // calculate denominator 
        for (int i = 0; i < len; i++) 
            sum = sum + n / arr.get(i); 
  
        sum = sum / n; 
  
        // Calculate harmonic mean and return 
  
        return arr.size() / sum; 
    } 
  
    // Function to check if a number 
    // is Ore number 
    static boolean isOreNumber(int n) 
    { 
        // Calculate Harmonic mean of divisors of n 
        double mean = harmonicMean(n); 
  
        // Check if Harmonic mean is an Integer or not 
        if (mean - Math.floor(mean) == 0) 
            return true; 
        else
            return false; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 28; 
  
        if (isOreNumber(n)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 

