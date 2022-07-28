

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the kth element 
// in the modified array 
static int getNumber(int n, int k) 
{ 
    int []arr = new int[n]; 
  
    int i = 0; 
  
    // First odd number 
    int odd = 1; 
    while (odd <= n) 
    { 
  
        // Insert the odd number 
        arr[i++] = odd; 
  
        // Next odd number 
        odd += 2; 
    } 
  
    // First even number 
    int even = 2; 
    while (even <= n) 
    { 
  
        // Insert the even number 
        arr[i++] = even; 
  
        // Next even number 
        even += 2; 
    } 
  
    // Return the kth element 
    return arr[k - 1]; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 8, k = 5; 
    System.out.println(getNumber(n, k)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

