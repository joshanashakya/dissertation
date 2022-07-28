

// Java program to check if a number  
// is fibinnary number or not 
class GFG { 
      
    // function to check if binary  
    // representation of an integer  
    // has consecutive 1s 
    static boolean checkFibinnary(int n)  
    { 
  
        // stores the previous last bit 
        // initially as 0 
        int prev_last = 0; 
          
        while (n != 0)  
        { 
              
            // if current last bit and  
            // previous last bit is 1 
            if ((n & 1) != 0 && prev_last != 0) 
              
                return false; 
          
            // stores the last bit 
            prev_last = n & 1; 
          
            // right shift the number 
            n >>= 1; 
        } 
      
        return true; 
    } 
      
    // Driver code to check above function 
    public static void main(String[] args) 
    { 
        int n = 10; 
  
        if (checkFibinnary(n) == true) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 
  
// This code is contributed by 
// Smitha Dinesh Semwal 

