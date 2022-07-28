

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the maximum bitwise AND 
// possible among all the possible pairs 
static int maxAND(int L, int R) 
{ 
    int maximum = L & R; 
  
    for (int i = L; i < R; i++) 
        for (int j = i + 1; j <= R; j++) 
  
            // Maximum among all (i, j) pairs 
            maximum = Math.max(maximum, (i & j)); 
  
    return maximum; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int L = 1, R = 632; 
    System.out.println(maxAND(L, R)); 
} 
} 
  
// This code contributed by Rajput-Ji 

