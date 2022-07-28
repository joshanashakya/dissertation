

// Java implementation of the above approach  
  
import java.io.*; 
  
class GFG { 
    // Function to check if it is possible  
static void printPossible(int a, int b, int c)  
{  
    if ((a + b + c) % 2 != 0 || a + b < c)  
        System.out.println("NO");  
    else
        System.out.println("YES");  
}  
  
// Driver code  
    public static void main (String[] args) { 
  
    int a = 2, b = 4, c = 2;  
    printPossible(a, b, c);  
    }  
}  
  
// This code is contributed by akt_mit 

