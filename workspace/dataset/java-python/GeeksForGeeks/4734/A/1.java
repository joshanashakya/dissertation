

// Java program to find number  
// of set bist in a number 
class GFG 
{ 
    // Recursive function to find  
    // number of set bist in a number 
    static int CountSetBits(int n) 
    { 
        // Base condition 
        if (n == 0) 
            return 0; 
              
        // If Least signifiant bit is set 
        if((n & 1) == 1) 
            return 1 + CountSetBits(n >> 1); 
          
        // If Least significant bit is not set 
        else
            return CountSetBits(n >> 1); 
    } 
      
    // Driver code 
    public static void main (String [] args) 
    { 
        int n = 21; 
          
        // Function call 
        System.out.println(CountSetBits(n)); 
    } 
} 
  
// This code is contributed by ihritik 

