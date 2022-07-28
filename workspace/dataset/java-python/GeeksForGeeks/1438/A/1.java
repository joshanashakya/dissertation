

// Java program to make a number odd 
import java.io.*; 
  
class GFG 
{ 
    // Function to find the value 
    static int makeOdd(int n) 
    { 
        // Return 1 if already odd 
        if (n % 2 != 0) 
            return 1; 
  
        // Check how many times it is divided by 2 
        int ans = 1; 
        while (n % 2 == 0) 
        { 
            n /= 2; 
            ans *= 2; 
        } 
        return ans; 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 36; 
        int res = makeOdd(n); 
        System.out.println(res); 
    } 
} 
// This code is contributed by Pramod Kumar 

