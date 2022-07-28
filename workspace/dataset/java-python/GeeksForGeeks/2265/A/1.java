

// java program to add two numbers 
// using ++ 
  
public class GFG { 
  
    // Returns value of x+y without 
    // using + 
    static int add(int x, int y) 
    { 
  
        // If y is positive, y times 
        // add 1 to x 
        while (y > 0 && y != 0) { 
            x++; 
            y--; 
        } 
  
        // If y is negative, y times 
        // subtract 1 from x 
        while (y < 0 && y != 0) { 
            x--; 
            y++; 
        } 
  
        return x; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        System.out.println(add(43, 23)); 
  
        System.out.println(add(43, -23)); 
    } 
} 
  
// This code is contributed by Sam007. 

