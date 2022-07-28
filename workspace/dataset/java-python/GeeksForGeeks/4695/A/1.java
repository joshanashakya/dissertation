

// Java implementation of the approach 
class GFG { 
  
    // Function to return the maximum rectangles possible 
    static int maxRectangles(int L, int B, int l, int b) 
    { 
        int horizontal = 0, vertical = 0; 
  
        // Cut rectangles horizontally if possible 
        if (l <= L && b <= B) { 
  
            // One rectangle is a single cell 
            int columns = B / b; 
            int rows = L / l; 
  
            // Total rectangles = total cells 
            horizontal = rows * columns; 
        } 
  
        // Cut rectangles vertically if possible 
        if (l <= B && b <= L) { 
            int columns = L / b; 
            int rows = B / l; 
  
            vertical = rows * columns; 
        } 
  
        // Return the maximum possible rectangles 
        return Math.max(horizontal, vertical); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int L = 10, B = 7, l = 4, b = 3; 
        System.out.print(maxRectangles(L, B, l, b)); 
    } 
} 

