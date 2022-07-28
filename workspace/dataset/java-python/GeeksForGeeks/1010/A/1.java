

// Java program to find the sum of all the elements 
// from the array whose square root is present 
// in the same array 
  
import java.util.*; 
public class GFG { 
  
    // Function to return the required sum 
    public static int getSum(int arr[], int n) 
    { 
  
        int i, sum = 0; 
  
        // Initialization of hash map 
        Set<Integer> hashSet = new HashSet<>(); 
  
        // Store each element in the hash map 
        for (i = 0; i < n; i++) 
            hashSet.add(arr[i]); 
  
        for (i = 0; i < n; i++) { 
            double sqrtCurrent = Math.sqrt(arr[i]); 
  
            // If sqrtCurrent is a decimal number 
            if (Math.floor(sqrtCurrent) != Math.ceil(sqrtCurrent)) 
                continue; 
  
            // If hash set contains sqrtCurrent 
            if (hashSet.contains((int)sqrtCurrent)) { 
                sum += (sqrtCurrent * sqrtCurrent); 
            } 
        } 
  
        return sum; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 2, 4, 5, 6, 7, 8, 9, 3 }; 
        int n = arr.length; 
        System.out.println(getSum(arr, n)); 
    } 
} 

