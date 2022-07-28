

// An efficient Java program to find if given 4 
// values can represent 4 sides of rectangle 
  
class GFG 
{ 
    // Function to check if the given 
    // integers value make a rectangle 
    static boolean isRectangle(int a, int b,  
                            int c, int d) 
    { 
        if ((a ^ b ^ c ^ d) != 0) 
            return false; 
        else
            return true; 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int a, b, c, d; 
        a = 3; b = 2; c = 3; d = 2; 
        if (isRectangle(a, b, c, d)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
          
    } 
} 
  
// This code is contributed by 
// Smitha Dinesh Semwal 

