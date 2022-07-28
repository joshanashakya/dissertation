

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find all the distinct 
// remainders when n is divided by 
// all the elements from 
// the range [1, n + 1] 
static void findRemainders(long n) 
{ 
  
    // Set will be used to store 
    // the remainders in order 
    // to eliminate duplicates 
    HashSet<Long> vc = new HashSet<Long>(); 
  
    // Find the remainders 
    for (long i = 1; i <= Math.ceil(Math.sqrt(n)); i++) 
        vc.add(n / i); 
    for (long i = (long) (n / Math.ceil(Math.sqrt(n)) - 1);  
                                                i >= 0; i--) 
        vc.add(i); 
  
    // Print the contents of the set 
    for (long it : vc) 
        System.out.print(it+ " "); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    long n = 5; 
  
    findRemainders(n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

