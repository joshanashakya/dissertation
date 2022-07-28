

// Java implementation of the approach 
class GFG { 
  
    // Function to return the required count 
    static int count(int n) 
    { 
  
        // To store the count of numbers 
        int cnt = 0; 
        int p = 1; 
        while (p <= n) { 
            cnt++; 
  
            // Every power of 2 contains 
            // only 1 set bit 
            p *= 2; 
        } 
        return cnt; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 7; 
        System.out.print(count(n)); 
    } 
} 

