

// Java Program to find the diagonal 
// of a regular polygon with given side length 
  
class GFG { 
  
// Function to find the diagonal 
// of a regular polygon 
    static float polydiagonal(float n, float a) { 
  
        // Side and side length cannot be negative 
        if (a < 0 && n < 0) { 
            return -1; 
        } 
  
        // diagonal 
        // degree converted to radians 
        return (float) (2 * a * Math.sin((((n - 2) * 180) / (2 * n)) * 3.14159 / 180)); 
    } 
  
// Driver code 
    public static void main(String[] args) { 
        float a = 9, n = 10; 
        System.out.printf("%.3f",polydiagonal(n, a)); 
  
    } 
}  
  
// This code is contributed by 29AjayKumar 

