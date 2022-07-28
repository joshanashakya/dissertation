

// Java implementation of the approach 
import java.util.Vector; 
  
class GFG 
{ 
  
  
// To store the random permutation 
static Vector<Integer> permutation = new Vector<>(); 
  
// Utility function to print 
// the generated permutation 
static void printPermutation() 
{ 
    permutation.stream().forEach((i) ->  
    { 
        System.out.print(i+" "); 
    }); 
} 
  
// Function to return a random 
// number between x and y 
static int give_random_number(int l, int r) 
{ 
    int x = (int) (Math.random()% (r - l + 1) + l); 
    return x; 
} 
  
// Recursive function to generate 
// the random permutation 
static void generate_random_permutation(int l, int r) 
{ 
  
    // Base condition 
    if (l > r) 
        return; 
  
    // Random number returned from the function 
    int n = give_random_number(l, r); 
  
    // Inserting random number in vector 
    permutation.add(n); 
  
    // Recursion call for [l, n - 1] 
    generate_random_permutation(l, n - 1); 
  
    // Recursion call for [n + 1, r] 
    generate_random_permutation(n + 1, r); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int l = 5; 
    int r = 15; 
  
    // Generate permutation 
    generate_random_permutation(l, r); 
  
    // Print the generated permutation 
    printPermutation(); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

