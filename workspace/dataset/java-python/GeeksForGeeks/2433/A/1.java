

// Java program to find a list of k elements from 
// an array such that difference between all of 
// them is divisible by m. 
import java.util.*; 
class GFG  
{ 
  
// function to generate k numbers whose difference  
// is divisible by m 
static void print_result(int a[], int n,  
                         int k, int m) 
{ 
    // Using an adjacency list like representation 
    // to store numbers that lead to same  
    // remainder. 
    Vector<Vector<Integer>> v = new Vector<Vector<Integer>>(m); 
    for(int i = 0; i < m; i++)  
        v.add(new Vector<Integer>()); 
  
    for (int i = 0; i < n; i++) 
    { 
  
        // stores the modulus when divided 
        // by m 
        int rem = a[i] % m; 
  
        v.get(rem).add(a[i]); 
          
        // If we found k elements which 
        // have same remainder. 
        if (v.get(rem).size() == k) 
        { 
            for (int j = 0; j < k; j++)  
                System.out.print(v.get(rem).get(j) + " "); 
            return;              
        }  
    } 
      
    // If we could not find k elements 
    System.out.print("-1"); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int a[] = { 1, 8, 4 }; 
    int n = a.length; 
    print_result(a, n, 2, 3); 
} 
} 
  
// This code is contributed by 29AjayKumar 

