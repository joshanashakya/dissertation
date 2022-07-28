

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to find sum of numbers at  
    // Lth level in Pascals Triangle  
    static int sum(int h)  
    {  
        return (int)Math.pow(2, h - 1);  
    }  
      
    // Driver Code  
    public static void main (String[] args) 
    {  
        int L = 3;  
          
        System.out.println(sum(L));  
    }  
} 
  
// This code is contributed by AnkitRai01 

