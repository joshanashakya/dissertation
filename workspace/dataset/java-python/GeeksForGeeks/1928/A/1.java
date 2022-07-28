

// Java implementation of the approach 
import java.util.*; 
class GFG  
{ 
  
// Function to find the permutation 
static int[] Findpermutation(int n) 
{ 
    int [] a = new int[n + 1]; 
  
    // Put n at the first index 1 
    a[1] = n; 
  
    // Put all the numbers from 
    // 2 to n sequentially 
    for (int i = 2; i <= n; i++) 
        a[i] = i - 1; 
  
    return a; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 8; 
  
    int []v = Findpermutation(n); 
  
    // Display the permutation 
    for (int i = 1; i <= n; i++) 
        System.out.print(v[i] + " "); 
} 
}  
  
// This code is contributed by 29AjayKumar 

