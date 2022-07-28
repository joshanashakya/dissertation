

// Java program to find 1's complement of n. 
class GFG { 
      
    static int onesComplement(int n) 
    { 
          
        // Find number of bits in the  
        // given integer 
        int number_of_bits =  
               (int)(Math.floor(Math.log(n) / 
                             Math.log(2))) + 1; 
  
        // XOR the given integer with poe(2, 
        // number_of_bits-1 and print the result 
        return ((1 << number_of_bits) - 1) ^ n; 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 22; 
          
        System.out.print(onesComplement(n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

