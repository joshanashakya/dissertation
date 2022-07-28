

// Java implementation of the above approach 
class GFG  
{ 
  
// Return the number is 
// Flavious Number or not 
static boolean Survives(int n) 
{ 
  
    // index i starts from 2 because 
    // at 1st iteration every 2nd 
    // element was remove and keep 
    // going for k-th iteration 
    for (int i = 2;; i++) 
    { 
        if (i > n) 
            return true; 
        if (n % i == 0) 
            return false; 
  
        // removing the elements which are 
        // already removed at kth iteration 
        n -= n / i; 
    } 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 17; 
    if (Survives(n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
}  
  
// This code is contributed by 29AjayKumar 

