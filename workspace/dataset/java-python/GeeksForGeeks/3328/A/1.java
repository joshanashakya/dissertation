

// Java program to print sorted distinct 
// elements. 
import java.io.*; 
import java.util.*; 
  
public class GFG { 
       
    static void printRepeating(Integer []arr, int size) 
    { 
        // Create a set using array elements 
        SortedSet<Integer> s = new TreeSet<>(); 
        Collections.addAll(s, arr); 
          
        // Print contents of the set. 
        System.out.print(s); 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        Integer []arr = {1, 3, 2, 2, 1}; 
        int n = arr.length; 
        printRepeating(arr, n); 
    } 
} 
   
// This code is contributed by 
// Manish Shaw (manishshaw1) 

