

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
  
// function to return the count 
// of the valid triplets 
static long countTriplets(int A, int B, int C) 
{ 
    long ans = 0; 
    for (int i = 1; i <= A; i++)  
    { 
        for (int j = 1; j <= B; j++) 
        { 
            for (int k = 1; k <= C; k++)  
            { 
                if (i * k > j * j) 
                    ans++; 
            } 
        } 
    } 
    return ans; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int A = 3, B = 2, C = 2; 
  
    // function calling 
    System.out.println(countTriplets(A, B, C)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

