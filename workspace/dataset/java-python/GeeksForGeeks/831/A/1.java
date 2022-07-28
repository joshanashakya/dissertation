

// Java implementation of the approach 
class GFG 
{ 
  
// Function that checks whether given angle 
// can be created using any 3 sides 
static double calculate_angle(int n, int i,  
                              int j, int k) 
{ 
    // Initialize x and y 
    int x, y; 
  
    // Calculate the number of vertices 
    // between i and j, j and k 
    if (i < j) 
        x = j - i; 
    else
        x = j + n - i; 
    if (j < k) 
        y = k - j; 
    else
        y = k + n - j; 
  
    // Calculate the angle subtended 
    // at the circumference 
    double ang1 = (180 * x) / n; 
    double ang2 = (180 * y) / n; 
  
    // Angle subtended at j can be found 
    // using the fact that the sum of angles 
    // of a triangle is equal to 180 degrees 
    double ans = 180 - ang1 - ang2; 
    return ans; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int n = 5; 
    int a1 = 1; 
    int a2 = 2; 
    int a3 = 5; 
  
    System.out.println((int)calculate_angle(n, a1, a2, a3)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

