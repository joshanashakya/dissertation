

// Java implementation of the approach 
  
class GFG 
{ 
      
    // Function to return the minimum  
    // number of steps required 
    static int minOperations(int N) 
    { 
        double x = Math.log(N) / Math.log(2); 
      
        int ans = (int)(Math.ceil(x)); 
      
        return ans; 
    } 
      
    // Driver Code 
    public static void main(String[] args) 
    { 
        int N = 10; 
        System.out.println(minOperations(N)); 
    } 
} 
  
// This code is contributed by Ryuga 

