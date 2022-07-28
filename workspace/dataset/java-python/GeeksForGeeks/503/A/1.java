

// Java program to find the 
// value at n-th place in  
// the given sequence 
  
import java.io.*; 
  
class GFG  
{ 
  
    // Returns n-th number in sequence  
    // 1, 1, 2, 1, 2, 3, 1, 2, 4, ... 
    static int findNumber(int n) 
    { 
        n--; 
  
        // One by one subtract counts 
        // elements in different blocks 
        int i = 1; 
        while (n >= 0)  
        { 
            n -= i; 
            ++i; 
        } 
  
        return (n + i); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 3; 
          
        System.out.println(findNumber(n)); 
    } 
} 
  
// This code is contributed by Ajit. 

