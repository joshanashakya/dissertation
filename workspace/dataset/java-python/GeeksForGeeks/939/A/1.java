

// Java implementation of the approach 
  
class GFG 
{ 
  
// Function to find the required permutation 
static void findPerm(int Q[], int n) 
{ 
  
    int minval = 0, qsum = 0; 
    for (int i = 0; i < n - 1; i++)  
    { 
  
        // Each element in P' is like a 
        // cumulative sum in Q 
        qsum += Q[i]; 
  
        // minval is the minimum 
        // value in P' 
        if (qsum < minval) 
            minval = qsum; 
    } 
    int []P = new int[n]; 
    P[0] = 1 - minval; 
  
    // To check if each entry in P 
    // is from the range [1, n] 
    boolean permFound = true; 
    for (int i = 0; i < n - 1; i++)  
    { 
        P[i + 1] = P[i] + Q[i]; 
  
        // Invalid permutation 
        if (P[i + 1] > n || P[i + 1] < 1) 
        { 
            permFound = false; 
            break; 
        } 
    } 
  
    // If a valid permutation exists 
    if (permFound) 
    { 
  
        // Print the permutation 
        for (int i = 0; i < n; i++)  
        { 
            System.out.print(P[i]+ " "); 
        } 
    } 
    else 
    { 
  
        // No valid permutation 
        System.out.print(-1); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int Q[] = { -2, 1 }; 
    int n = 1 + Q.length; 
  
    findPerm(Q, n); 
  
} 
} 
  
// This code is contributed by 29AjayKumar 

