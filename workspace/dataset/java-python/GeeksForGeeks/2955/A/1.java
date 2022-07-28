

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the count of valid pairs 
static int cntPairs(int a[], int n) 
{ 
  
    // To store the count of odd numbers and 
    // the count of even numbers such that 2 
    // is the only even factor of that number 
    int odd = 0, even = 0; 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // If current number is odd 
        if (a[i] % 2 == 1) 
            odd++; 
  
        // If current number is even and 2 
        // is the only even factor of it 
        else if ((a[i] / 2) % 2 == 1) 
            even++; 
    } 
  
    // Calculate total number of valid pairs 
    int ans = odd * even + (odd * (odd - 1)) / 2; 
  
    return ans; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int a[] = { 4, 2, 7, 11, 14, 15, 18 }; 
    int n = a.length; 
  
    System.out.println(cntPairs(a, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

