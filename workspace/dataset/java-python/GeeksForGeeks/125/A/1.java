

// Java program to find the number 
// of permutations that satisfy 
// the given condition in an array 
  
import java.util.*; 
  
class GFG{ 
   
// Function to calculate x ^ y 
// recursively 
static int pow(int x, int y) 
{ 
    if (y == 1) 
        return x; 
    if (y == 0) 
        return 1; 
   
    int temp = pow(x, y / 2); 
   
    temp *= temp; 
   
    if (y % 2 == 1) 
        temp *= x; 
   
    return temp; 
} 
   
// Function to return the number of 
// permutations that satisfy the 
// given condition in an array 
static int noOfPermutations(int []a, int n) 
{ 
    // If there is only one element then 
    // only one permutation is available 
    if (n == 1) { 
        return 1; 
    } 
   
    // Sort the array for calculating 
    // the number of elements occurring twice 
    Arrays.sort(a); 
   
    // If the maximum element is occurring 
    // twice, then the number of permutations 
    // satisfying the condition is 0 
    if (a[n - 1] == a[n - 2]) { 
        return 0; 
    } 
   
    // This variable will store the 
    // number of element occurring twice 
    int x = 0; 
   
    // Loop to check the number of elements 
    // occurring twice 
    for (int i = 0; i < n - 2; ++i) { 
   
        // Check if this element 
        // is occuring twice 
        if (a[i] == a[i + 1]) { 
   
            // If this element is occurring 
            // twice then check if this number 
            // is occurring more than twice 
            if (a[i] == a[i + 2]) { 
   
                // If element occuring thrice 
                // then no permutation will 
                // satisfy the given condition 
                return 0; 
            } 
   
            x++; 
   
            // Since we have checked the next 
            // element as well, then we can 
            // increment the loop variable 
            i++; 
        } 
    } 
   
    return pow(2, n - 2 * x - 1); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 1, 2, 2, 3, 4 }; 
    int n = a.length; 
    int num = noOfPermutations(a, n); 
    System.out.print(num); 
} 
} 
  
// This code is contributed by 29AjayKumar 

