

// Java program for printing 
// the hollow triangle pattern 
import java.util.*; 
  
class solution 
{ 
  
// Function for printing pattern 
static void pattern(int N) 
{ 
    int i, j, k = 0, space = 1, rows = N; 
  
    // For printing stars 
    for (i = rows; i >= 1; i--) { 
        for (j = 1; j <= i; j++) { 
            System.out.print("*"); 
        } 
        if (i != rows) { 
            // for printing space 
            for (k = 1; k <= space; k++) { 
            System.out.print(" "); 
            } 
  
            // increment by 2 
            space = space + 2; 
        } 
        for (j = i; j >= 1; j--) { 
            if (j != rows) 
                System.out.print("*"); 
        } 
        System.out.print("\n"); 
    } 
    System.out.print("\n"); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    // Get N 
    int N = 6; 
  
    // Print the pattern 
    pattern(N); 
  
}  
} 
  
//This code is contributed by Surendra_Gangwar 

