

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function that returns true 
    // if n is prime 
    static boolean isPrime(int n) 
    { 
        if (n == 0 || n == 1) 
        { 
            return false; 
        } 
        for (int i = 2; i * i <= n; i++)  
        { 
            if (n % i == 0)  
            { 
                return false; 
            } 
        } 
  
        return true; 
    } 
  
    // Function to return the sum 
    // of the ascii values of the characters 
    // which are present at prime positions 
    static int sumAscii(String str, int n)  
    { 
        // To store the sum 
        int sum = 0; 
  
        // For every character 
        for (int i = 0; i < n; i++)  
        { 
  
            // If current position is prime 
            // then add the ASCII value of the 
            // character at the current position 
            if (isPrime(i + 1))  
            { 
                sum += (int) (str.charAt(i)); 
            } 
        } 
  
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "geeksforgeeks"; 
        int n = str.length(); 
  
        System.out.println(sumAscii(str, n)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

