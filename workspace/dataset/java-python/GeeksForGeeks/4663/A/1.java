

// Java program to count numbers whose bitwise 
// OR and sum with N are equal 
class GFG { 
      
    // Function to find total 0 bit in a number 
    static int CountZeroBit(int n) 
    { 
        int count = 0; 
          
        while(n > 0) 
        {  
            if ((n & 1) != 0) 
                count++; 
                  
            n >>= 1; 
        } 
          
        return count; 
    } 
      
    // Function to find Count of non-negative  
    // numbers less than or equal to N, whose  
    // bitwise OR and SUM with N are equal. 
    static int CountORandSumEqual(int N ) 
    { 
          
        // count number of zero bit in N 
        int count = CountZeroBit(N); 
      
        // power of 2 to count 
        return (1 << count); 
    } 
      
    //Driver code 
    public static void main (String[] args) 
    { 
          
        int N = 10; 
          
        System.out.print(CountORandSumEqual(N)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

