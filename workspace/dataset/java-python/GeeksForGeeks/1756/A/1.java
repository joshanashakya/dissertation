

// Java implementation of naive approach 
  
public class GFG  
{ 
    // Method to calculate the power of prime number p in n! 
    static int PowerOFPINnfactorial(int n, int p) 
    { 
        // initializing answer 
        int ans = 0; 
       
        // finding power of p from 1 to n 
        for (int i = 1; i <= n; i++) { 
       
            // variable to note the power of p in i 
            int count = 0, temp = i; 
       
            // loop until temp is equal to i 
            while (temp % p == 0) { 
                count++; 
                temp = temp / p; 
            } 
       
            // adding count to i 
            ans += count; 
        } 
        return ans; 
    } 
      
    // Driver Method 
    public static void main(String[] args) 
    { 
        System.out.println(PowerOFPINnfactorial(4, 2)); 
    } 
} 

