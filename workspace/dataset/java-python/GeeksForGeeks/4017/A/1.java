

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the count  
    // of possible numbers  
    static int count(int n)  
    {  
        return (int)Math.pow(2, n - 1);  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 4;  
      
        System.out.println(count(n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

