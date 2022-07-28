

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the maximum bitwise OR 
// possible among all the possible pairs 
static int maxOR(int L, int R) 
{ 
    int maximum = Integer.MIN_VALUE; 
  
    // Check for every possible pair 
    for (int i = L; i < R; i++) 
        for (int j = i + 1; j <= R; j++) 
  
            // Maximum among all (i, j) pairs 
            maximum = Math.max(maximum, (i | j)); 
  
    return maximum; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int L = 4, R = 5; 
  
    System.out.println(maxOR(L, R)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

