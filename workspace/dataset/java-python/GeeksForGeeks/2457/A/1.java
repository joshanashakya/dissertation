

// Java implementation of the approach 
import java .io.*; 
  
class GFG 
{ 
      
// Function that returns true if 
// it is possible to move from source 
// to the destination with the given moves 
static boolean isPossible(int Sx, int Sy, int Dx, 
                          int Dy, int x, int y) 
{ 
    if (Math.abs(Sx - Dx) % x == 0 &&  
        Math.abs(Sy - Dy) % y == 0 &&  
       (Math.abs(Sx - Dx) / x) % 2 ==  
       (Math.abs(Sy - Dy) / y) % 2) 
        return true; 
  
    return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int Sx = 0, Sy = 0, Dx = 0, Dy = 0; 
    int x = 3, y = 4; 
  
    if (isPossible(Sx, Sy, Dx, Dy, x, y)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by inder_verma.. 

