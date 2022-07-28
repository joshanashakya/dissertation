

// Java program to find the nth element  
// of Stern's Diatomic Series 
  
class GFG { 
      
    // function to find nth stern' 
    // diatomic series 
    static int findSDSFunc(int n) 
    { 
          
        // Initializing the DP array 
        int DP[] = new int[n+1]; 
      
        // SET the Base case 
        DP[0] = 0; 
        DP[1] = 1; 
      
        // Traversing the array from  
        // 2nd Element to nth Element 
        for (int i = 2; i <= n; i++) 
        { 
              
            // Case 1: for even n 
            if (i % 2 == 0) 
                DP[i] = DP[i / 2]; 
              
            // Case 2: for odd n 
            else
                DP[i] = DP[(i - 1) / 2] + 
                            DP[(i + 1) / 2]; 
        } 
          
        return DP[n]; 
    } 
      
    // Driver program 
    public static void main(String[] args) 
    { 
        int n = 15; 
          
        System.out.println(findSDSFunc(n)); 
    } 
} 
  
// This code is contributed by Smita Semwal. 

