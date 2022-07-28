

// Java Program to print all cube free 
// numbers smaller than or equal to n. 
  
class GFG 
{ 
    // Returns true if n is a cube free 
    // number, else returns false. 
    public static boolean isCubeFree(int n) 
    { 
        if (n == 1) 
            return false; 
  
        // check for all possible divisible cubes 
        for (int i = 2; i * i * i <= n; i++) 
            if (n % (i * i * i) == 0) 
                return false; 
  
        return true; 
    } 
  
    // Print all cube free numbers smaller 
    // than n. 
    public static void printCubeFree(int n) 
    { 
        for (int i = 2; i <= n; i++) 
        { 
            if (isCubeFree(i)) 
            { 
                System.out.print ( i + " "); 
            }     
        } 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
        int n = 20; 
        printCubeFree(n); 
    } 
} 
  
// Contributed by _omg 

