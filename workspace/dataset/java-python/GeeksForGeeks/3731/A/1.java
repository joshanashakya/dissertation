

// Java implementation of the approach 
import java.util.*; 
      
class GFG 
{ 
static class pair 
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}  
  
// Function to perform the given queries 
static void performQueries(int []A, 
                           pair[] q) 
{ 
    int n = A.length; 
  
    // To store the cumulative xor 
    int []pref_xor = new int[n + 1]; 
  
    // Taking cumulative Xor 
    for (int i = 1; i <=n; ++i)  
    { 
        pref_xor[i] = pref_xor[i - 1] ^  
                             A[i - 1]; 
    } 
  
    // Iterating over the queries 
    for (pair i : q) 
    { 
        int L = i.first, R = i.second; 
        if (L > R) 
        { 
            int temp = L; 
            L = R; 
            R = temp; 
        } 
          
        // If both indices are different and xor 
        // in the range [L, R] is 0 
        if (L != R && pref_xor[R] == pref_xor[L - 1]) 
            System.out.println("Yes"); 
    else
        System.out.println("No"); 
    } 
} 
  
// Driver code 
static public void main (String []arg) 
{ 
    int []Arr = { 1, 1, 2, 2, 1 }; 
    pair[] q = { new pair(1, 5 ), 
                 new pair(1, 4 ), 
                 new pair(3, 4 ) }; 
  
    performQueries(Arr, q); 
} 
} 
  
// This code is contributed by 29AjayKumar 

