

// Java implementation of above approach  
  
public class GFG { 
    // Function taking coefficient of 
    // each term of equation as input 
    static double sumProductDifference(int a, int b, int c, int d, int e) { 
        // Finding sum of roots 
        double rootSum = (double)(-1 * b) / a; 
  
        // Finding product of roots 
        double rootProduct = (double) e / a; 
          
        // Absolute difference 
        return Math.abs(rootSum - rootProduct); 
    } 
  
    // Driver Code 
    public static void main(String args[]) { 
        System.out.println(sumProductDifference(8, 4, 6, 4, 1)); 
    } 
} 

