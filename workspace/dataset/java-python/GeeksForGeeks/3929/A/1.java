

// Java program for 
// minimizing graph 
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
  
    // Utility function for 
    // finding min of a row 
    static int minFn(int arr[]) 
    { 
        int min = Integer.MAX_VALUE; 
  
        for (int i = 0; 
             i < arr.length; i++) 
            if (min > arr[i]) 
                min = arr[i]; 
        return min; 
    } 
  
    // Utility function 
    // for minimizing graph 
    static void minimizeGraph(int arr[][]) 
    { 
        int min; 
  
        // Set empty edges 
        // to INT_MAX 
        for (int i = 0; 
             i < arr.length; i++) 
            for (int j = 0; 
                 j < arr.length; j++) 
                if (arr[i][j] == 0) 
                    arr[i][j] = Integer.MAX_VALUE; 
  
        // Finding minimum of each 
        // row and deleting rest 
        // of edges 
        for (int i = 0; 
             i < arr.length; i++) { 
  
            // Find minimum 
            // element of row 
            min = minFn(arr[i]); 
  
            for (int j = 0; 
                 j < arr.length; j++) { 
                // If edge value is not 
                // min set it to zero, 
                // also edge value INT_MAX 
                // denotes that initially 
                // edge value was zero 
                if ((arr[i][j] != min) || (arr[i][j] == Integer.MAX_VALUE)) 
                    arr[i][j] = 0; 
                else
                    min = 0; 
            } 
        } 
  
        // Print result; 
        for (int i = 0; 
             i < arr.length; i++) { 
            for (int j = 0; 
                 j < arr.length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.print("\n"); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        // Input Graph 
        int arr[][] = { { 1, 2, 4, 0 }, 
                        { 0, 0, 0, 5 }, 
                        { 0, 2, 0, 3 }, 
                        { 0, 0, 0, 0 } }; 
  
        minimizeGraph(arr); 
    } 
} 

