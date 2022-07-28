

// Java program to find any pair 
// which has sum S and product P. 
import java.util.*; 
   
class GFG  
{ 
  
// Prints roots of quadratic equation 
// ax*2 + bx + c = 0 
static void findRoots(int b, int c) 
{ 
   
    int a = 1; 
    int d = b * b - 4 * a * c; 
   
    // calculating the sq root value 
    // for b * b - 4 * a * c 
    double sqrt_val = Math.sqrt(Math.abs(d)); 
   
    if (d > 0) { 
        double x = -b + sqrt_val; 
        double y = -b - sqrt_val; 
   
        // Finding the roots 
        int root1 = (int)(x) / (2 * a); 
        int root2 = (int) (y) / (2 * a); 
   
        // Check if the roots 
        // are valid or not 
        if (root1 + root2 == -1 * b 
            && root1 * root2 == c) 
            System.out.print( root1 + ", " + root2); 
        else
            System.out.print( -1); 
    } 
    else if (d == 0) { 
   
        // Finding the roots 
        int root = -b / (2 * a); 
   
        // Check if the roots 
        // are valid or not 
        if (root + root == -1 * b 
            && root * root == c) 
            System.out.print(root+ ", "+root); 
        else
            System.out.print(-1); 
    } 
   
    // when d < 0 
    else { 
   
        // No such pair exists in this case 
        System.out.print( -1); 
    } 
   
    System.out.println(); 
} 
   
// Driver code 
public static void main (String []args) 
{ 
    int S = 5, P = 6; 
    findRoots(-S, P); 
   
    S = 5;  
    P = 9; 
    findRoots(-S, P); 
}  
} 
  
// This code is contributed by chitranayal 

