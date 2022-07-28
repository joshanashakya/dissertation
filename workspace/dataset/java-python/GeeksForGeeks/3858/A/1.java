

// Java program for finding 
// the required pairs 
import java.io.*; 
  
class GFG  
{ 
      
    // Finding the number 
    // of unique pairs 
    static int No_Of_Pairs(int N) 
    { 
        int i = 1; 
      
        // Using the derived formula 
        while ((i * i * i) +  
               (2 * i * i) + i <= N) 
            i++; 
      
        return (i - 1); 
    } 
      
    // Printing the unique pairs 
    static void print_pairs(int pairs) 
    { 
        int i = 1, mul; 
        for (i = 1; i <= pairs; i++) 
        { 
            mul = i * (i + 1); 
            System.out.println("Pair no. " + i + " --> (" +  
                                         (mul * i) + ", " +  
                                      mul * (i + 1) + ")");  
        } 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int N = 500, pairs, mul, i = 1; 
        pairs = No_Of_Pairs(N); 
      
        System.out.println("No. of pairs = " + pairs); 
        print_pairs(pairs); 
    } 
} 
  
// This code is contributed by Mahadev. 

