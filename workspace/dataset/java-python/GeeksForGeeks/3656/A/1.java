

// Java implementation of the approach 
class GFG 
{ 
  
// Function to find the normal 
// of the straight line 
static float normal(float m, float n) 
{ 
    // Length of the normal 
    float N = (float) ((Math.abs(m) * Math.abs(n)) 
            / Math.sqrt((Math.abs(m) * Math.abs(m)) 
                    + (Math.abs(n) * Math.abs(n)))); 
  
    return N; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    float m = -5, n = 3; 
    System.out.println(normal(m, n)); 
} 
}  
  
// This code has been contributed by 29AjayKumar 

