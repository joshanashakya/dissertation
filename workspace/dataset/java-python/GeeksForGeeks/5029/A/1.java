

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the minimum 
// value of x from the given array q 
static int Get_Minimum(int [] q) 
{ 
    int minimum = 0; 
    int sum = 0; 
    for(int i = 0; i < q.length - 1; i++) 
    { 
        sum += q[i]; 
        if (sum < minimum) 
            minimum = sum; 
    } 
    return minimum; 
} 
  
// Function to return the required permutation 
static int [] Find_Permutation(int [] q, int n) 
{ 
    int [] p = new int[n]; 
    int min_value = Get_Minimum(q); 
  
    // Set the value of p[0] i.e. x = p[0] 
    p[0] = 1 - min_value; 
  
    // Iterate over array q[] 
    for (int i = 0; i < n - 1; i++) 
        p[i + 1] = p[i] + q[i]; 
  
    boolean okay = true; 
  
    // Check if formed permutation 
    // is correct or not 
    for (int i = 0; i < n; i++) 
    { 
        if (p[i] < 1 || p[i] > n) 
            okay = false; 
        Set<Integer> w = new HashSet<>(); 
        if (w.size() != n) 
            okay = true; 
    } 
  
    // Return the permutation p 
    if (okay) 
        return p; 
    else
        return new int []{-1}; 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    int []q = {-2, 1}; 
    int n = q.length + 1; 
    System.out.print("[ "); 
    for (int i:Find_Permutation(q, n)) 
        System.out.print(i + " "); 
    System.out.print("]"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

