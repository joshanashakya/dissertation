

// Java program to find distinct 
// elements in suffix 
import java.util.*; 
  
class GFG  
{ 
  
  
// Function to answer queries for distinct 
// count in Suffix 
static void printQueries(int n, int a[], int q, int qry[]) 
{ 
    // Set to keep the distinct elements 
    HashSet<Integer> occ = new HashSet<>(); 
  
    int []suffixCount = new int[n + 1]; 
  
    // Precompute the answer for each suffix 
    for (int i = n - 1; i >= 0; i--)  
    { 
        occ.add(a[i]); 
        suffixCount[i + 1] = occ.size(); 
    } 
  
    // Print the precomputed answers 
    for (int i = 0; i < q; i++) 
        System.out.println(suffixCount[qry[i]]); 
} 
  
// Driver Code 
public static void main(String args[])  
{ 
    int n = 5, q = 3; 
    int a[] = { 2, 4, 6, 10, 2 }; 
    int qry[] = { 1, 3, 2 }; 
  
    printQueries(n, a, q, qry); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

