

// Java program to print n-th number  
// in Recaman's sequence 
import java.util.*; 
  
class GFG 
{ 
  
// Prints first n terms of Recaman sequence 
static void recaman(int n) 
{ 
    if (n <= 0) 
    return; 
  
    // Print first term and store it in a hash  
    System.out.printf("%d, ", 0); 
    HashSet<Integer> s = new HashSet<Integer>(); 
    s.add(0); 
  
    // Print remaining terms using  
    // recursive formula. 
    int prev = 0; 
    for (int i = 1; i< n; i++) 
    { 
        int curr = prev - i; 
  
        // If arr[i-1] - i is negative or 
        // already exists. 
        if (curr < 0 || s.contains(curr)) 
            curr = prev + i; 
  
        s.add(curr); 
  
        System.out.printf("%d, ", curr); 
        prev = curr; 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 17; 
    recaman(n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

