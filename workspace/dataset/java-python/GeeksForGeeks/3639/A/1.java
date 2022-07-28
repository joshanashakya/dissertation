

// Java implementation of the approach 
  
class GFG 
{ 
  
static double pie = 3.1415926535897; 
  
// Function to return the time when 
// the glass will be empty 
static double findsolution(double d, double h, 
                    double m, double n) 
{ 
    double k = (4 * m) / (pie * d * d); 
  
    // Check the condition when the 
    // glass will never be empty 
    if (n > k) 
        return -1; 
  
    // Find the time 
    double ans = (h / (k - n)); 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    double d = 1, h = 1, m = 1, n = 1; 
  
    System.out.printf("%.5f",findsolution(d, h, m, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

