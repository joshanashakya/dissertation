

// JAVA program to generate 
// Gould's Sequence 
  
class GFG { 
  
    // Function to generate gould's Sequence 
    static void gouldSequence(int n) 
    { 
        // loop to generate each row 
        // of pascal's Triangle up to nth row 
        for (int row_num = 1; row_num <= n; row_num++) { 
  
            int count = 1; 
            int c = 1; 
  
            // Loop to generate each element of ith row 
            for (int i = 1; i <= row_num; i++) { 
  
                c = c * (row_num - i) / i; 
  
                // if c is odd 
                // increment count 
                if (c % 2 == 1) 
                    count++; 
            } 
  
            // print count of odd elements 
            System.out.print(count + " "); 
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

