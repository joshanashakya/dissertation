

// Java program to find the max sum of 
// numbers whose lcm is n 
  
class MaxSum 
{ 
    // Returns maximum sum of numbers with 
    // LCM as N 
    static int maxSumLCM(int n) 
    { 
        int max_sum = 0;  // Initialize result 
       
        // Finding a divisor of n and adding 
        // it to max_sum 
        for (int i=1; i*i<=n; i++) 
        { 
            if (n%i == 0) 
            { 
                max_sum += i; 
                if (n/i != i) 
                    max_sum += (n/i); 
            } 
        } 
          
        return max_sum; 
    } 
      
    // main function 
    public static void main (String[] args)  
    { 
        int n = 2; 
        System.out.println(maxSumLCM(n)); 
    } 
} 

