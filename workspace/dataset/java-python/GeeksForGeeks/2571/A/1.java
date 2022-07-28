

// Java implementation of the above approach 
class GFG { 
      
// Array that stores the factorial 
// till 20 
final static int fact[] = new int[21]; 
  
    // Function to pre-compute 
    // the factorial till 20 
    static void preCompute() 
    { 
      
        // Precomputing factorials 
        fact[0] = 1; 
      
        for (int i = 1; i < 18; i++) 
            fact[i] = (fact[i - 1] * i); 
    } 
      
    // Function to return the next 
    // factorial number greater than N 
    static void nextFactorial(int N) 
    { 
        // Traverse the factorial array 
        for (int i = 0; i < 21; i++) { 
      
            // Find the next just greater 
            // factorial than N 
            if (N < fact[i]) { 
      
                System.out.println(fact[i]); 
                break; 
            } 
        } 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        // Function to precalculate 
        // the factorial till 20 
        preCompute(); 
      
        int N = 120; 
      
        // Function call 
        nextFactorial(N); 
    } 
      
} 
  
// This code is contributed by AnkitRai01 

