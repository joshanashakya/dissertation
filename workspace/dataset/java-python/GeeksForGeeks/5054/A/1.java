

// Java Program all sequence of length s  
// starting with n such that difference  
// between consecutive element is less than k. 
import java.io.*; 
import java.util.*; 
  
public class GFG { 
   
    static List<Integer> v = new ArrayList<Integer>(); 
    // Recursive function to print all sequence  
    // of length s starting with n such that  
    // difference between consecutive element  
    // is less than k. 
    static void printSequence(int n, 
                                   int s, int k) 
    { 
        // If size become 0, print the sequence. 
        if (s == 0) { 
            for (int i = 0; i < v.size(); i++) 
                System.out.print(v.get(i) + " "); 
            System.out.println(); 
            return; 
        } 
        
        // Increment the next element and make  
        // recursive call after inserting the  
        // (n + i) to the sequence. 
        for (int i = 0; i < k; i++) { 
            v.add(n + i); 
            printSequence(n + i, s - 1, k); 
            v.remove(v.size() - 1); 
        } 
        
        // Decrementing the next element and' 
        // make recursive call after inserting  
        // the (n - i) to the sequence. 
        for (int i = 1; i < k; i++) { 
            v.add(n - i); 
            printSequence(n - i, s - 1, k); 
            v.remove(v.size() - 1); 
        } 
    } 
        
    // Wrapper Function 
    static void wrapper(int n, int s, int k) 
    { 
        v.add(n); 
        printSequence(n, s - 1, k); 
    } 
        
    // Driven Program 
    public static void main(String args[]) 
    { 
        int n = 5, s = 3, k = 2; 
        wrapper(n, s, k); 
    } 
} 
   
// This code is contributed by Manish Shaw 
// (manishshaw1) 

