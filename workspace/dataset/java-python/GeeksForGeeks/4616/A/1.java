

// Java implementation of the above approach 
class GFG 
{ 
      
    // Function to return the sum of numbers  
    // which are in the ration a:b and after  
    // adding x to both the numbers  
    // the new ratio becomes c:d 
    static double sum(double a, double b,  
                      double c, double d,  
                      double x) 
    { 
        double ans = (x * (a + b) * (c - d)) /  
                         ((a * d) - (b * c)); 
        return ans; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        double a = 1, b = 2, c = 9, d = 13, x = 5; 
          
        System.out.println(sum(a, b, c, d, x)); 
    } 
} 
  
// This code is contributed by ihritik 

