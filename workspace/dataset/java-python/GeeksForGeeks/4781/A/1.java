

// Java Program to convert given 
// decimal number into decimal 
// equivalent of its gray code form 
class GFG { 
      
    static int grayCode(int n) 
    { 
          
        // Right Shift the number  
        // by 1 taking xor with  
        // original number  
        return n ^ (n >> 1); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
          
        int n = 10; 
          
        System.out.println(grayCode(n)); 
    } 
} 
  
// This code is contributed by 
// Smitha Dinesh Semwal 

