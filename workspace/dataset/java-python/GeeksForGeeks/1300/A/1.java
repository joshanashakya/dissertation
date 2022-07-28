

// Java implementation of the approach 
class GFG 
{ 
    // Function to return the required count 
    static int count(int n) 
    { 
        return (int)(-1 + Math.sqrt(1 + 8 * n)) / 2; 
  
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 10; 
      
        System.out.println(count(n)); 
    } 
} 
  
// This code is contributed by ihritik 

