

// Java implementation of the approach 
class GFG  
{ 
      
// Function to return the minimum required  
// absolute difference  
  
    static int minAbsDiff(int n) 
    { 
        int mod = n % 4; 
        if (mod == 0 || mod == 3)  
        { 
            return 0; 
        } 
        return 1; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int n = 5; 
        System.out.println(minAbsDiff(n)); 
    } 
} 
  
// This code is contributed by Rajput-JI 

