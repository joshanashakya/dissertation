

// Java implementation of the approach 
  
import java.io.*; 
  
class GFG { 
  
// Function to return the minimum number  
// of required changes 
static int minimumChanges(int n, int a[]) 
{ 
    int i; 
    int []sf= new int[n+1]; 
    sf[n] = 0; 
    for (i = n - 1; i >= 0; i--) { 
        sf[i] = sf[i + 1]; 
        if (a[i] <= 0) 
            sf[i]++; 
    } 
  
    // number of elements >=0 in prefix 
    int pos = 0; 
  
    // Minimum elements to change 
    int mn = n; 
    for (i = 0; i < n - 1; i++) { 
        if (a[i] >= 0) 
            pos++; 
        mn = Math.min(mn, pos + sf[i + 1]); 
    } 
    return mn; 
} 
  
    // Driver Program to test above function 
    public static void main (String[] args) { 
    int []a = { -1, -2, -3, 3, -5, 3, 4 }; 
    int n = a.length; 
    System.out.println( minimumChanges(n, a)); 
    } 
} 
// This code is contributed by inder_verma. 

