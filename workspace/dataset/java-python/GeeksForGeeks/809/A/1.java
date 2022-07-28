

// Java implementation of the approach 
import java.util.*; 
class GFG 
{ 
  
// Storing all the possible 
// changes to make the triangle 
// right-angled 
static int dx[] = { -1, 0, 1, 0 }; 
static int dy[] = { 0, 1, 0, -1 }; 
  
// Function to check if the triangle 
// is right-angled or not 
static boolean ifRight(int x1, int y1, 
                       int x2, int y2, 
                       int x3, int y3) 
{ 
    int a = ((x1 - x2) * (x1 - x2)) +  
            ((y1 - y2) * (y1 - y2)); 
  
    int b = ((x1 - x3) * (x1 - x3)) +  
            ((y1 - y3) * (y1 - y3)); 
  
    int c = ((x2 - x3) * (x2 - x3)) +  
            ((y2 - y3) * (y2 - y3)); 
  
    if ((a == (b + c) && a != 0 && b != 0 && c != 0) ||  
        (b == (a + c) && a != 0 && b != 0 && c != 0) ||  
        (c == (a + b) && a != 0 && b != 0 && c != 0))  
    { 
        return true; 
    } 
    return false; 
} 
  
// Function to check if the triangle 
// can be transformed to right-angled 
static void isValidCombination(int x1, int y1, 
                               int x2, int y2, 
                               int x3, int y3) 
{ 
    int x, y; 
  
    // Boolean variable to 
    // return true or false 
    boolean possible = false; 
  
    // If it is already right-angled 
    if (ifRight(x1, y1, x2, y2, x3, y3)) 
    { 
        System.out.print("ALREADY RIGHT ANGLED"); 
        return; 
    } 
    else
    { 
  
        // Applying the changes on the 
        // co-ordinates 
        for (int i = 0; i < 4; i++)  
        { 
  
            // Applying on the first 
            // co-ordinate 
            x = dx[i] + x1; 
            y = dy[i] + y1; 
  
            if (ifRight(x, y, x2, y2, x3, y3))  
            { 
                System.out.print("POSSIBLE"); 
                return; 
            } 
  
            // Applying on the second 
            // co-ordinate 
            x = dx[i] + x2; 
            y = dy[i] + y2; 
  
            if (ifRight(x1, y1, x, y, x3, y3)) 
            { 
                System.out.print("POSSIBLE"); 
                return; 
            } 
  
            // Applying on the third 
            // co-ordinate 
            x = dx[i] + x3; 
            y = dy[i] + y3; 
  
            if (ifRight(x1, y1, x2, y2, x, y))  
            { 
                System.out.print("POSSIBLE"); 
                return; 
            } 
        } 
    } 
  
    // If can't be transformed 
    if (!possible) 
        System.out.println("NOT POSSIBLE"); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int x1 = -49, y1 = 0; 
    int x2 = 0, y2 = 50; 
    int x3 = 0, y3 = -50; 
  
    isValidCombination(x1, y1, x2, y2, x3, y3); 
} 
} 
  
// This code is contributed by Rajput-Ji 

