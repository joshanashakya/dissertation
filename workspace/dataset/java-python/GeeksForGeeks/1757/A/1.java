

// Java implementation of finding power of p in n! 
  
public class GFG  
{ 
    // Method to calculate the power of prime number p in n! 
    static int PowerOFPINnfactorial(int n, int p) 
    { 
        // initializing answer 
        int ans = 0; 
       
        // initializing 
        int temp = p; 
       
        // loop until temp<=n 
        while (temp <= n) { 
       
            // add number of numbers divisible by n 
            ans += n / temp; 
       
            // each time multiply temp by p 
            temp = temp * p; 
        } 
        return ans; 
    } 
      
    // Driver Method 
    public static void main(String[] args) 
    { 
        System.out.println(PowerOFPINnfactorial(4, 2)); 
    } 
} 

