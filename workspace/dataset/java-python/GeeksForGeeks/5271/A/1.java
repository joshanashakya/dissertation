

// Java program to print the  
// last occurrence of every  
// element in relative order 
import java.util.*; 
  
class GFG 
{ 
      
    // Function to print the last  
    // occurrence of every element 
    // in an array 
    public static void printLastOccurrence(int a[], 
                                           int n) 
    { 
        HashMap<Integer,  
                Integer> map = new HashMap<Integer,  
                                           Integer>(); 
          
        // iterate and store the last  
        // index of every element 
        for (int i = 0; i < n; i++) 
            map.put(a[i], i); 
              
        for (int i = 0; i < n; i++) 
        { 
        if (map.get(a[i]) == i) 
            System.out.print(a[i] +" "); 
        }  
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int a[] = { 1, 5, 5, 1, 6, 1 }; 
        int n = a.length; 
        printLastOccurrence(a, n); 
    } 
} 
  
// This code is contributed 
// by ankita_saini 

