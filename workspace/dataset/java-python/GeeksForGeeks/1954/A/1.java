

// Java program to implement Boole's Rule 
// on the given function 
class GFG{ 
      
// In order to represent the implementation, 
// a function f(x) = 1/(1 + x) is considered 
// in this program 
   
// Function to return the value of f(x) 
// for the given value of x 
static float y(float x) 
{ 
    return (1 / (1 + x)); 
} 
   
// Function to computes the integrand of y 
// at the given intervals of x with 
// step size h and the initial limit a 
// and final limit b 
static float BooleRule(float a, float b) 
{ 
    // Number of intervals 
   
    int n = 4; 
    int h; 
   
    // Computing the step size 
    h = (int) ((b - a) / n); 
    float sum = 0; 
   
    // Substituing a = 0, b = 4 and h = 1 
    float bl = (7 * y(a) + 32 * y(a + h) 
                + 12 * y(a + 2 * h) 
                + 32 * y(a + 3 * h) 
                + 7 * y(a + 4 * h)) 
               * 2 * h / 45; 
   
    sum = sum + bl; 
    return sum; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    System.out.printf(("f(x) = %.4f"), 
           BooleRule(0, 4)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

