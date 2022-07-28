

// Java program to count number  
// of ways to connect n (where  
// n is even) points on a circle 
// such that no two connecting 
// lines cross each other and  
// every point is connected with 
// one other point. 
import java.io.*; 
  
class GFG  
{ 
  
// A dynamic programming  
// based function to find  
// nth Catalan number 
static int catalanDP(int n) 
{ 
    // Table to store  
    // results of subproblems 
    int []catalan = new int [n + 1]; 
  
    // Initialize first 
    // two values in table 
    catalan[0] = catalan[1] = 1; 
  
    // Fill entries in catalan[]  
    // using recursive formula 
    for (int i = 2; i <= n; i++) 
    { 
        catalan[i] = 0; 
        for (int j = 0; j < i; j++) 
            catalan[i] += catalan[j] *  
                          catalan[i - j - 1]; 
    } 
  
    // Return last entry 
    return catalan[n]; 
} 
  
// Returns count of ways to  
// connect n points on a circle 
// such that no two connecting 
// lines cross each other and 
// every point is connected  
// with one other point. 
static int countWays(int n) 
{ 
    // Throw error if n is odd 
    if (n < 1) 
    { 
        System.out.println("Invalid"); 
        return 0; 
    } 
  
    // Else return n/2'th  
    // Catalan number 
    return catalanDP(n / 2); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    System.out.println(countWays(6) + " "); 
} 
} 
  
// This code is contributed  
// by akt_mit 

