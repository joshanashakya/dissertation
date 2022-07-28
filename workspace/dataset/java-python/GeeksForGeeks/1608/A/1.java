

// Java program to find maximum 
// element of each column in a matrix 
public class GFG { 
  
    // Function to find the maximum 
    // element of each column. 
    public static void largestInColumn(int cols, int[][] arr) 
    { 
  
        for (int i = 0; i < cols; i++) { 
  
            // Initialize max to 0 at begining 
            // of finding max element of each column 
            int maxm = arr[0][i]; 
            for (int j = 1; j < arr[i].length; j++) 
                if (arr[j][i] > maxm) 
                    maxm = arr[j][i]; 
  
            System.out.println(maxm); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[][] arr = new int[][] { { 3, 4, 1, 8 }, 
                                    { 1, 4, 9, 11 }, 
                                    { 76, 34, 21, 1 }, 
                                    { 2, 1, 4, 5 } }; 
        // Calling the function 
        largestInColumn(4, arr); 
    } 
} 

