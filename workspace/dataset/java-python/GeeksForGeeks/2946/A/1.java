

// Java program to find the largest 
// possible k-multiple set 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the largest 
// possible k-multiple set 
static void K_multiple(int a[], int n, int k) 
{ 
    // Sort the given array 
    Arrays.sort(a); 
  
    // To store k-multiple set 
    HashSet<Integer> s = new HashSet<>(); 
  
    // Traverse through the whole array 
    for (int i = 0; i < n; i++) 
    { 
        // Check if x/k is already present or not 
        if ((a[i] % k == 0 && !s.contains(a[i] / k))  
            || a[i] % k != 0) 
            s.add(a[i]); 
    } 
  
    // Print the k-multiple set 
    for (Integer i:s) 
        System.out.print(i+" "); 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    int a[] = { 2, 3, 4, 5, 6, 10 } ; 
    int k = 2; 
  
    int n = a.length; 
  
    // Function call 
    K_multiple(a, n, k); 
} 
} 
  
// This code contributed by Rajput-Ji 

