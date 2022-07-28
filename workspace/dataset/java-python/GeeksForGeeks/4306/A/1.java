

// Java implementation of the approach 
class GFG 
{ 
// Function to print the desired 
// Alphabet H Pattern 
static void alphabetPattern(int N) 
{ 
  
    // Declaring the values of left, 
    // middle, right side 
    int left = 0, middle = N - 1, right = N + 1; 
  
    // Main Row Loop 
    for (int row = 0; row < 2 * N - 1; row++) { 
  
        // Condition for the left Values 
        if (row < N) 
            System.out.print( ++left); 
        else
            System.out.print(--left); 
  
        // Loop for the middle values 
        for (int col = 1; col < N - 1; col++) { 
  
            // Condition for the middleValues 
            if (row != N - 1) 
  
                // Two spaces for perfect alignment 
            System.out.print( "  "); 
                      
            else
                System.out.print( " " +middle--); 
        } 
  
        // Condition for the right Values 
        if (row < N) 
            System.out.print( " "  +--right); 
        else
            System.out.print( " " + ++right); 
        System.out.println(); 
    } 
} 
  
// Driver Code 
    public static void main(String[] args) { 
  
    // Size of the Pattern 
    int N = 4; 
  
    alphabetPattern(N); 
// This code is contributed by Rajput-Ji 
  
} 
} 

