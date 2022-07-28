

// Java Program to count factorial 
// numbers in given range 
  
class GFG 
{ 
    static int countFact(int low, int high) 
    { 
        // Find the first factorial number  
        // 'fact' greater than or equal to 'low' 
        int fact = 1, x = 1; 
        while (fact < low) 
        { 
            fact = fact * x; 
            x++; 
        } 
      
        // Count factorial numbers  
        // in range [low, high] 
        int res = 0; 
        while (fact <= high) 
        { 
            res++; 
            fact = fact * x; 
            x++; 
        } 
      
        // Return the count 
        return res; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        System.out.print("Count is " 
                         + countFact(2, 720)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

