

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the count 
// of the required pairs 
static int sumEqualProduct(int a[], int n) 
{ 
    int zero = 0, two = 0; 
  
    // Find the count of 0s 
    // and 2s in the array 
    for (int i = 0; i < n; i++) 
    { 
        if (a[i] == 0) 
        { 
            zero++; 
        } 
        if (a[i] == 2)  
        { 
            two++; 
        } 
    } 
  
    // Find the count of required pairs 
    int cnt = (zero * (zero - 1)) / 2 +  
                (two * (two - 1)) / 2; 
  
    // Return the count 
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 2, 2, 3, 4, 2, 6 }; 
    int n = a.length; 
  
    System.out.print(sumEqualProduct(a, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

