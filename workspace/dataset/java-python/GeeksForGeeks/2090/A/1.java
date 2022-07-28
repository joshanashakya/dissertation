

// Java program of the above approach 
  
import java.io.*; 
import java.util.*; 
class GFG { 
      
// function to calculate minimum sum after transformation 
static int min_sum(int n, int k, int a[]) 
{ 
  
    Arrays.sort(a); 
  
    if (a[0] < 0)  
        return -1; 
      
  
    // no element can be reduced further 
    if (k == 0) { 
  
        // if all the elements of the array 
        // are identical 
        if (a[0] == a[n - 1]) 
            return (n * a[0]); 
        else
            return -1; 
    } 
    else { 
        int f = 0; 
        for (int i = 1; i < n; i++) { 
  
            int p = a[i] - a[0]; 
  
            // check if a[i] can be reduced to a[0] 
            if (p % k == 0) 
                continue; 
            else { 
                f = 1; 
                break; 
            } 
        } 
  
        // one of the elements cannot be reduced 
        // to be equal to the other elements 
        if (f>0) 
            return -1; 
        else { 
  
            // if k = 1 then all elements can be reduced to 1 
            if (k == 1) 
                return n; 
            else
                return (n * (a[0] % k)); 
        } 
    } 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
            int arr[] = { 2, 3, 4, 5 }; 
    int K = 1; 
    int N = arr.length; 
    System.out.println(min_sum(N, K, arr)); 
    } 
} 
// This code is contributed by shs.. 

