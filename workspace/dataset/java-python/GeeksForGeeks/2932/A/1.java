

// Java program to count 
// occurrences of an 
// element in an unsorted 
// array 
  
import java.io.*; 
  
class GFG { 
      
    static int frequency(int a[], 
    int n, int x) 
    { 
        int count = 0; 
        for (int i=0; i < n; i++) 
        if (a[i] == x)  
            count++; 
        return count; 
    } 
      
    // Driver program 
    public static void main (String[] 
    args) { 
          
        int a[] = {0, 5, 5, 5, 4}; 
        int x = 5; 
        int n = a.length; 
          
        System.out.println(frequency(a, n, x)); 
    } 
} 
  
// This code is contributed 
// by Ansu Kumari 

