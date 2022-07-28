

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the minimum 
// inversions required so that no 
// two adjacent elements are same 
static int min_changes(int a[], int n) 
{ 
    // To store the inversions required 
    // to make the array {1, 0, 1, 0, 1, 0, 1, ...} 
    // and {0, 1, 0, 1, 0, 1, 0, ...} respectively 
    int ans_a = 0, ans_b = 0; 
  
    // Find all the changes required 
    for (int i = 0; i < n; i++) 
    { 
        if (i % 2 == 0)  
        { 
            if (a[i] == 0) 
                ans_a++; 
            else
                ans_b++; 
        } 
        else 
        { 
            if (a[i] == 0) 
                ans_b++; 
            else
                ans_a++; 
        } 
    } 
  
    // Return the required answer 
    return Math.min(ans_a, ans_b); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 1, 0, 0, 1, 0, 0, 1, 0 }; 
    int n = a.length; 
  
    System.out.println(min_changes(a, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

