

// Java program to count number of numbers from 
// 1 to n are of type x^y where x>0 and y>1 
import java.io.*; 
import java.util.*; 
  
public class GFG { 
  
    // Function that keeps all the odd power 
    // numbers upto n 
    static int powerNumbers(int n) 
    { 
        // v is going to store all unique  
        // power numbers 
        HashSet<Integer> v = new HashSet<Integer>(); 
        v.add(1); 
       
        // Traverse through all base numbers 
        // and compute all their powers 
        // smaller than or equal to n. 
        for (int i = 2; i * i <= n; i++) { 
            int j = i * i; 
            v.add(j); 
            while (j * i <= n) { 
                v.add(j * i); 
                j = j * i; 
            } 
        } 
        return v.size(); 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        System.out.print(powerNumbers(50)); 
    } 
} 
   
// This code is contributed by Manish Shaw 
// (manishshaw1) 

