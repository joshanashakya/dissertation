

// java program to find largest number 
// smaller than equal to n with m set 
// bits then m-1 0 bits. 
public class GFG { 
      
    // Returns largest number with  
    // m set bits then m-1 0 bits. 
    static long answer(long n) 
    { 
           
        // Start with 2 bits. 
        long m = 2; 
       
        // initial answer is 1 which 
        // meets the given condition 
        long ans = 1; 
        long r = 1; 
       
        // check for all numbers 
        while (r < n) { 
       
            // compute the number 
            r = ((long)Math.pow(2, m) - 1) *  
                ((long)Math.pow(2, m - 1)); 
       
            // if less then N 
            if (r < n) 
                ans = r; 
       
            // increment m to get  
            // the next number 
            m++; 
        } 
       
        return ans; 
    } 
  
    // Driver code    
    public static void main(String args[]) { 
          
         long n = 7; 
         System.out.println(answer(n)); 
    } 
} 
  
// This code is contributed by Sam007 

