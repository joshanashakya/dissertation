

// Java implementation of the approach 
class GFG 
{ 
      
// find maximum element in an array 
static int max_element(int a[], int n) 
{ 
    int m = Integer.MIN_VALUE; 
      
    for(int i = 0; i < n; i++) 
        m = Math.max(m, a[i]); 
      
    return m; 
} 
  
// Function to find the numbers from 
// the given arrays such that their 
// sum is not present in any 
// of the given array 
static void findNum(int a[], int n,  
                    int b[], int m) 
{ 
    // Find the maximum element 
    // from both the arrays 
    int x = max_element(a, n); 
    int y = max_element(b, m); 
    System.out.print(x + " " + y); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int a[] = { 3, 2, 2 }; 
    int n = a.length; 
    int b[] = { 1, 5, 7, 7, 9 }; 
    int m = b.length; 
  
    findNum(a, n, b, m); 
} 
} 
  
// This code is contributed by Arnub Kundu 

