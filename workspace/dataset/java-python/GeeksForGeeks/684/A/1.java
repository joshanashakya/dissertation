

// Java implementation of the approach 
class GFG  
{ 
  
// Function to find maximum element 
// among (N - 1) elements other than 
// a[i] for each i from 1 to N 
static void max_element(int a[], int n) 
{ 
    // To store prefix max element 
    int []pre = new int[n]; 
  
    pre[0] = a[0]; 
    for (int i = 1; i < n; i++) 
        pre[i] = Math.max(pre[i - 1], a[i]); 
  
    // To store suffix max element 
    int []suf = new int[n]; 
  
    suf[n - 1] = a[n - 1]; 
    for (int i = n - 2; i >= 0; i--) 
        suf[i] = Math.max(suf[i + 1], a[i]); 
  
    // Find the maximum element 
    // in the array other than a[i] 
    for (int i = 0; i < n; i++)  
    { 
        if (i == 0) 
            System.out.print(suf[i + 1] + " "); 
  
        else if (i == n - 1) 
            System.out.print(pre[i - 1] + " "); 
  
        else
            System.out.print(Math.max(pre[i - 1], 
                              suf[i + 1]) + " "); 
    } 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int a[] = { 2, 5, 6, 1, 3 }; 
    int n = a.length; 
  
    max_element(a, n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

