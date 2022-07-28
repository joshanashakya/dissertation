

// Java program to move form  
// (a, 0) to (b, 0) with given jumps  
import java.io.*; 
  
class GFG { 
  
// Function to check if it is possible  
static boolean Move(int a, int x, int b)  
{  
    if ((((b - a) % x == 0) || ((b - a - 1) % x == 0) && a + 1 != b) && b >= a)  
        return true;  
  
    return false;  
}  
  
// Driver code  
    public static void main (String[] args) { 
            int a = 3, x = 2, b = 7;  
  
    // function call  
    if (Move(a, x, b))  
        System.out.println( "Yes");  
    else
        System.out.println( "No");  
    } 
} 
//This code is contributed by shs.. 

