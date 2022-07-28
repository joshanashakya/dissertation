

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Counts the number of triplets 
// for a given value of b 
static long getCount(int A, int B2, int C) 
{ 
    long count = 0; 
  
    // Count all triples in which a = i 
    for (int i = 1; i <= A; i++) 
    { 
  
        // Smallest value j 
        // such that i*j > B2 
        long j = (B2 / i) + 1; 
  
        // Count all (i, B2, x) 
        // such that x >= j 
        if (C >= j) 
            count = (count + C - j + 1); 
  
        // count all (x, B2, y) such 
        // that x >= j this counts 
        // all such triples in 
        // which a >= j 
        if (A >= j && C >= i) 
            count = (count + (C - i + 1) * 
                             (A - j + 1)); 
  
        // As all triples with a >= j 
        // have been counted reduce 
        // A to j - 1. 
        if (A >= j) 
            A = (int) (j - 1); 
    } 
    return count; 
} 
  
// Counts the number of triples that 
// satisfy the given constraints 
static long countTriplets(int A, int B, int C) 
{ 
    long ans = 0; 
    for (int i = 1; i <= B; i++) 
    { 
  
        // GetCount of triples in which b = i 
        ans = (ans + getCount(A, i * i, C)); 
    } 
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int A, B, C; 
    A = 3; B = 2; C = 2; 
  
    // Function calling 
    System.out.println(countTriplets(A, B, C)); 
} 
} 
  
// This code is contributed by Princi Singh 

