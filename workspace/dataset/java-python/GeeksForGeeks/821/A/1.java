

// Java implementation to find the 
// maximum area inscribed in an 
// equilateral triangle 
  
class GFG 
{ 
    // Function to find the maximum area 
    // of the rectangle inscribed in an 
    // equilateral triangle of side S 
    static double solve(int s) 
    { 
        // Maximum area of the rectangle 
        // inscribed in an equilateral 
        // triangle of side S 
        double area = (1.732 * Math.pow(s, 2))/8; 
        return area; 
      
    } 
      
    // Driver Code 
    public static void  main(String[] args) 
    { 
        int n = 14; 
        System.out.println(solve(n)); 
    } 
} 
      
// This article is contributed by Apurva raj 

