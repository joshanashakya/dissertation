

// Program to find index of an element 
// after given range reversals. 
import java.util.Arrays; 
  
class GFG { 
    // Function to compute the element at 
    // query index 
    static int answer(int[] arr, int[][] ranges, 
                      int reversals, int index) 
    { 
        for (int i = reversals - 1; i >= 0; i--) { 
            // Range[left...right] 
            int left = ranges[i][0], 
                right = ranges[i][1]; 
  
            // If doesn't satisfy, reversal 
            // won't have any effect 
            if (left <= index && right >= index) 
                index = right + left - index; 
        } 
  
        // Returning element at modified index 
        return arr[index]; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int[] arr = { 10, 20, 30, 40, 50 }; 
  
        // reversals 
        int reversals = 2; 
        int[][] ranges = { { 1, 4 }, { 0, 2 } }; 
  
        int index = 1; 
        System.out.println(answer(arr, ranges, 
                                  reversals, index)); 
    } 
} 
  
/* This code is contributed by Mr. Somesh Awasthi */

