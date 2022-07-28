

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to count maximum number of  
    // intersections possible  
    static int countIntersections(int n)  
    {  
        return n * (n - 1) / 2;  
    }  
      
    // Driver Code  
    public static void main (String[] args)  
    {  
        int n = 3;  
      
        System.out.println(countIntersections(n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

