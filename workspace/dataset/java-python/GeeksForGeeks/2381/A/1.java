

// Java program to find n-th number  
// in the sorted list of multiples 
// of two numbers. 
import java.io.*;  
import java.util.*;  
class GFG 
{ 
// Return the n-th number in the sorted 
// list of multiples of two numbers. 
static int nthElement(int a, int b, int n) 
{ 
    ArrayList<Integer> seq = new
              ArrayList<Integer>(n * n + 1);  
      
    // Generating first n multiple of a. 
    for (int i = 1; i <= n; i++) 
        seq.add(a * i); 
          
    // Sorting the sequence. 
    Collections.sort(seq); 
      
    // Generating and storing first n  
    // multiple of b and storing if  
    // not present in the sequence. 
    for (int i = 1, k = n;  
             i <= n && k > 0; i++) 
    { 
        // If not present in the sequence 
        if (seq.indexOf(b * i) == -1) 
        { 
            // Storing in the sequence. 
            seq.add(b * i); 
            Collections.sort(seq); 
            k--; 
        } 
    } 
    return seq.get(n - 1); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a = 3, b = 5, n = 5; 
    System.out.println(nthElement(a, b, n)); 
} 
} 
  
// This code is contributed by mits 

