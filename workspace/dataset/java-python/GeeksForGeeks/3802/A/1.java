

// Java implementation of the approach 
class GFG 
{ 
      
// Function that returns true if it is 
// possible to make the permutation 
// increasing by swapping any two numbers 
static boolean isPossible(int a[], int n) 
{ 
    // To count misplaced elements 
    int k = 0; 
  
    // Count all misplaced elements 
    for (int i = 0; i < n; i++)  
    { 
        if (a[i] != i + 1) 
            k++; 
    } 
  
    // If possible 
    if (k <= 2) 
        return true; 
  
    return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 5, 2, 3, 4, 1 }; 
    int n = a.length; 
  
    if (isPossible(a, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Code_Mech 

