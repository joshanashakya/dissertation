

// Java program to find minimum number of factorials 
import java.util.*; 
  
class GFG{ 
   
// Array to calculate all factorials 
// less than or equal to N 
// Since there can be only 14 factorials 
// till 10^10 
// Hence the maximum size of fact[] is 14 
static int []fact = new int[14]; 
   
// Store the actual size of fact[] 
static int size = 1; 
   
// Function to precompute factorials till N 
static void preCompute(int N) 
{ 
    // Precomputing factorials 
    fact[0] = 1; 
   
    for (int i = 1; fact[i - 1] <= N; i++) { 
        fact[i] = (fact[i - 1] * i); 
        size++; 
    } 
} 
   
// Function to find the minimum number 
// of factorials whose sum represents N 
static void findMin(int N) 
{ 
   
    // Precompute factorials 
    preCompute(N); 
   
    int originalN = N; 
   
    // Initialize result 
    Vector<Integer> ans = new Vector<Integer>(); 
   
    // Traverse through all factorials 
    for (int i = size - 1; i >= 0; i--) { 
   
        // Find factorials 
        while (N >= fact[i]) { 
            N -= fact[i]; 
            ans.add(fact[i]); 
        } 
    } 
   
    // Print min count 
    System.out.print(ans.size()+ "\n"); 
   
    // Print result 
    for (int i = 0; i < ans.size(); i++) 
        System.out.print(ans.get(i)+ " "); 
} 
   
// Driver program 
public static void main(String[] args) 
{ 
    int n = 27; 
    findMin(n); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

