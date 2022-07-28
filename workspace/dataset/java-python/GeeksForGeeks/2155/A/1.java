

// Java implementation of above approach 
class GFG { 
  
    // Function to return the count of 
    // total positions the Bishop 
    // can visit in a single move 
    static int countSquares(int row, int column) 
    { 
  
        // Count top left squares 
        int topLeft = Math.min(row, column) - 1; 
  
        // Count bottom right squares 
        int bottomRight = 8 - Math.max(row, column); 
  
        // Count top right squares 
        int topRight = Math.min(row, 9 - column) - 1; 
  
        // Count bottom left squares 
        int bottomLeft = 8 - Math.max(row, 9 - column); 
  
        // Return total count 
        return (topLeft + topRight + bottomRight + bottomLeft); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Bishop's Position 
        int row = 4, column = 4; 
  
        System.out.println(countSquares(row, column)); 
    } 
} 

