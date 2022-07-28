

// Java program to find Xor 
// of all elements with set bits 
// equal to K 
import java.util.*; 
  
class GFG 
{ 
  
    // Function to find Xor 
    // of desired elements 
    static int xorGivenSetBits(int arr[],  
                                int n, int k) 
    { 
        // Initialize vector 
        Vector<Integer> v = new Vector<>(); 
  
        for (int i = 0; i < n; i++)  
        { 
            if (Integer.bitCount(arr[i]) == k) 
            { 
                // push required elements 
                v.add(arr[i]); 
            } 
        } 
  
        // Initialize result with first element of vector 
        int result = v.get(0); 
  
        for (int i = 1; i < v.size(); i++)  
        { 
            result = result ^ v.get(i); 
        } 
  
        return result; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {2, 13, 1, 19, 7}; 
        int n = arr.length; 
        int k = 3; 
        System.out.println(xorGivenSetBits(arr, n, k)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

