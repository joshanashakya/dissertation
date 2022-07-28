

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
// Recursive function that returns  
// the count of permutation-based  
// on the length of the array.  
static int count(int n) 
{  
    if(n == 0) 
        return 1; 
    if(n == 1) 
        return 1; 
    else
        return (n * count(n - 1)) +  
              ((n - 1) * count(n - 2)); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int A[] = {1, 2, 3, 9}; 
      
    // length of array 
    int n = 4; 
          
    // Output required answer 
    System.out.println(count(n - 1));  
} 
}  
  
// This code is contributed by PrinciRaj1992 

