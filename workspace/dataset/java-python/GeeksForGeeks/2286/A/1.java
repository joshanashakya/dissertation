

// JAVA program to generate 
// Gould's Sequence 
  
class GFG { 
  
    // Utility function to count odd numbers 
    // in ith row of Pascals's triangle 
    static int countOddNumber(int row_num) 
    { 
  
        // Count set bits in row_num 
  
        // Initialize count as zero 
        int count = 0; 
        while (row_num > 0) { 
            count += row_num & 1; 
            row_num >>= 1; 
        } 
  
        // Return 2^count 
        return (1 << count); 
    } 
  
    // Function to generate gould's Sequence 
    static void gouldSequence(int n) 
    { 
        // loop to generate gould's Sequence up to n 
        for (int row_num = 0; row_num < n; row_num++) { 
  
            System.out.print(countOddNumber(row_num) + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Get n 
        int n = 16; 
  
        // Function call 
        gouldSequence(n); 
    } 
} 

