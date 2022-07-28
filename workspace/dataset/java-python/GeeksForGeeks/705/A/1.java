

// Java program to check whether it is possible 
// or not to move from (0, 0) to (x, y) 
// in exactly n steps 
import java.io.*; 
  
public class GFG { 
  
// Function to check whether it is possible 
// or not to move from (0, 0) to (x, y) 
// in exactly n steps 
static boolean Arrive(int a, int b, int n) 
{ 
    if (n >= Math.abs(a) + Math.abs(b) && (n - (Math.abs(a) + Math.abs(b))) % 2 == 0) 
        return true; 
  
    return false; 
} 
  
// Driver code 
int main() 
{ 
  
    return 0; 
} 
  
    public static void main (String[] args) { 
          
    int a = 5, b = 5, n = 11; 
  
    if (Arrive(a, b, n)) 
        System.out.println( "Yes"); 
    else
        System.out.println( "No"); 
    } 
} 
//This code is contributed by shs.. 

