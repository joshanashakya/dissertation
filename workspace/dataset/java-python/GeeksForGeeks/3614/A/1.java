

// Java program to check if two points  
// lie on the same side or not 
import java.util.*; 
  
class GFG 
{ 
  
// Function to check if two points  
// lie on the same side or not 
static boolean pointsAreOnSameSideOfLine(int a, int b,  
                                         int c, int x1,  
                                         int y1, int x2,  
                                         int y2) 
{ 
    int fx1; // Variable to store a * x1 + b * y1 - c 
    int fx2; // Variable to store a * x2 + b * y2 - c 
  
    fx1 = a * x1 + b * y1 - c; 
    fx2 = a * x2 + b * y2 - c; 
  
    // If fx1 and fx2 have same sign 
    if ((fx1 * fx2) > 0) 
        return true; 
  
    return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a = 1, b = 1, c = 1; 
    int x1 = 1, y1 = 1; 
    int x2 = 2, y2 = 1; 
  
    if (pointsAreOnSameSideOfLine(a, b, c, x1, y1, x2, y2)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

