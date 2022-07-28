

// Java program to find the maximum  
// number of contiguous array elements 
// with same number of set bits 
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
      
    // Function to find maximum contiguous 
    // elements with same set bits 
    static int sameSetBits(int arr[], int n) 
    { 
        Vector<Integer> v = new Vector<>(); 
      
        // Insert number of set bits in each element 
        // of the array to the vector 
                for (int i = 0; i < n; i++) 
        { 
            int count = Integer.bitCount(arr[i]); 
            v.add(count); 
        } 
      
        int current_count = 1, max_count = 1; 
      
        // Finding the maximum number of same 
        // contiguous elements 
        for (int i = 1; i < v.size()-1; i++) 
        { 
            if (v.get(i + 1) == v.get(i)) 
                current_count++; 
            else
                current_count = 1; 
      
            max_count = Math.max(max_count, current_count); 
        } 
      
        // return answer 
        return max_count; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int arr[] = { 9, 75, 14, 7, 13, 11 }; 
        int n = arr.length; 
        System.out.println(sameSetBits(arr, n)); 
    } 
} 
  
// This code is contributed by Archana_kumari 

