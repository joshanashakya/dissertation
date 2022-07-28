

// Java implementation of the approach 
import java.util.HashSet; 
  
class GFG { 
  
    // Function to return the count of all identical rows 
    public static int countIdenticalRows(int mat[][]) 
    { 
  
        int count = 0; 
  
        for (int i = 0; i < mat.length; i++) { 
  
            // HashSet for current row 
            HashSet<Integer> hs = new HashSet<>(); 
  
            // Traverse the row 
            for (int j = 0; j < mat[i].length; j++) { 
  
                // Add all the values of the row in HashSet 
                hs.add(mat[i][j]); 
            } 
  
            // Check if size of HashSet = 1 
            if (hs.size() == 1) 
                count++; 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int mat[][] = { { 1, 1, 1 }, 
                        { 1, 2, 3 }, 
                        { 5, 5, 5 } }; 
        System.out.print(countIdenticalRows(mat)); 
    } 
} 

