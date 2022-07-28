

// Java implementation of the approach 
class GFG 
{ 
  
// Function to make array non-decreasing 
static boolean isPossible(int a[], int n) 
{ 
    // Take the first element 
    int cur = a[0]; 
  
    // Perform the operation 
    cur--; 
  
    // Traverse the array 
    for (int i = 1; i < n; i++) 
    { 
  
        // Next element 
        int nxt = a[i]; 
  
        // If next element is greater than the 
        // current element then decrease 
        // it to increase the possibilities 
        if (nxt > cur) 
            nxt--; 
  
        // It is not possible to make the 
        // array non-decreasing with 
        // the given operation 
        else if (nxt < cur) 
            return false; 
  
        // Next element is now the current 
        cur = nxt; 
    } 
  
    // The array can be made non-decreasing 
    // with the given operation 
    return true; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int a[] = { 1, 2, 1, 2, 3 }; 
    int n = a.length; 
  
    if (isPossible(a, n)) 
        System.out.printf("Yes"); 
    else
        System.out.printf("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

