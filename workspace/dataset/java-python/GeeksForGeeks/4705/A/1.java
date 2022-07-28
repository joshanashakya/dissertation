

// Java implementation of the approach 
class GFG { 
  
    // Function to return the amount of notes 
    // with value A required 
    static int bankNotes(int A, int B, int S, int N) 
    { 
        int numerator = S - (B * N); 
        int denominator = A - B; 
  
        // If possible 
        if (numerator % denominator == 0) 
            return (numerator / denominator); 
        return -1; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int A = 1, B = 2, S = 7, N = 5; 
        System.out.print(bankNotes(A, B, S, N)); 
    } 
} 

