

// Java program to implement Runge 
// Kutta method 
class GFG { 
      
    // A sample differential equation 
    // "dy/dx = (x - y)/2" 
    static double dydx(double x, double y) 
    { 
        return (x + y - 2); 
    } 
      
    // Finds value of y for a given x 
    // using step size h 
    // and initial value y0 at x0. 
    static double rungeKutta(double x0, double y0, 
                     double x, double h) 
    { 
        // Count number of iterations 
        // using step size or 
        // step height h 
        int n = (int)((x - x0) / h); 
      
        double k1, k2; 
      
        // Iterate for number of iterations 
        double y = y0; 
        for (int i = 1; i <= n; i++) { 
            // Apply Runge Kutta Formulas 
            // to find next value of y 
            k1 = h * dydx(x0, y); 
            k2 = h * dydx(x0 + 0.5 * h, 
                          y + 0.5 * k1); 
      
            // Update next value of y 
            y = y + (1.0 / 6.0) * (k1 + 2 * k2); 
      
            // Update next value of x 
            x0 = x0 + h; 
        } 
      
        return y; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        double x0 = 0, y = 1, 
              x = 2, h = 0.2; 
      
        System.out.println(rungeKutta(x0, y, x, h)); 
    } 
} 
  
// This code is contributed by Yash_R 

