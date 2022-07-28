

import java.util.HashSet; 
  
// Java implementation of the approach  
class GFG1  
{ 
  
    static int MAX = 100000; 
  
    // To store first N Catalan numbers  
    static long catalan[] = new long[MAX]; 
  
    // Function to find first n Catalan numbers  
    static void catalanDP(long n)  
    { 
  
        // Initialize first two values in table  
        catalan[0] = catalan[1] = 1; 
  
        // Filong entries in catalan[]  
        // using recursive formula  
        for (int i = 2; i <= n; i++)  
        { 
            catalan[i] = 0; 
            for (int j = 0; j < i; j++)  
            { 
                catalan[i] += catalan[j] * catalan[i - j - 1]; 
            } 
        } 
    } 
  
    // Function to return the minimum changes required  
    static int CatalanSequence(int arr[], int n)  
    { 
  
        // Find first n Catalan Numbers  
        catalanDP(n); 
  
        HashSet<Integer> s = new HashSet<Integer>(); 
  
        // a and b are first two  
        // Catalan Sequence numbers  
        int a = 1, b = 1; 
        int c; 
  
        // Insert first n catalan elements to set  
        s.add(a); 
        if (n >= 2)  
        { 
            s.add(b); 
        } 
  
        for (int i = 2; i < n; i++)  
        { 
            s.add((int) catalan[i]); 
        } 
  
        for (int i = 0; i < n; i++)  
        { 
  
            // If catalan element is present  
            // in the array then remove it from set  
            if (s.contains(arr[i]))  
            { 
                s.remove(arr[i]); 
            } 
        } 
  
        // Return the remaining number of  
        // elements in the set  
        return s.size(); 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int arr[] = {1, 1, 2, 5, 41}; 
        int n = arr.length; 
  
        System.out.print(CatalanSequence(arr, n)); 
    } 
}  
  
// This code contributed by Rajput-Ji 

