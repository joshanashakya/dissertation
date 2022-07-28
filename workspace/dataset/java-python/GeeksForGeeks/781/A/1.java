

// Java implementation to find the N 
// numbers such that their 
// sum is a perfect cube 
class GFG  
{ 
          
    // Function to find the N 
    // numbers such that their 
    // sum is a perfect cube 
    static void findNumbers(int n) 
    { 
        int i = 1; 
          
        // Loop to find the Ith term 
        // of the Centered Hexagonal number 
        while (i <= n) 
        { 
            System.out.print((3 * i * (i - 1) + 1) + " "); 
            i++; 
        } 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        int n = 4; 
      
        // Function Call 
        findNumbers(n); 
    } 
} 
  
// This code is contributed by AnkitRai01 

