

// Java program to find the value of f(n)/f(r)*f(n-r)   
  
class GFG { 
// Function to find value of given F(n)  
  
    static int calcFunction(int n, int r) { 
        int finalDenominator = 1; 
        int mx = Math.max(r, n - r); 
  
        // iterate over n  
        for (int i = mx + 1; i <= n; i++) { 
  
            // calculate result  
            int denominator = (int) Math.pow(i, i); 
            int numerator = (int) Math.pow(i - mx, i - mx); 
            finalDenominator = (finalDenominator 
                    * denominator) 
                    / numerator; 
        } 
  
        // return the result  
        return finalDenominator; 
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int n = 6, r = 2; 
        System.out.println("1/" + calcFunction(n, r)); 
  
    } 
} 
// This code is contributed by RAJPUT-JI 

