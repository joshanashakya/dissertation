

// Java code to verify Nesbitt's Inequality 
class GFG { 
      
    static boolean isValidNesbitt(double a, 
                          double b, double c) 
    { 
          
        // 3 parts of the inequality sum 
        double A = a / (b + c); 
        double B = b / (a + c); 
        double C = c / (a + b); 
        double inequality = A + B + C; 
  
        return (inequality >= 1.5); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        double a = 1.0, b = 2.0, c = 3.0; 
        if(isValidNesbitt(a, b, c) == true)  
        { 
            System.out.print("Nesbitt's inequality"
                                  + " satisfied."); 
            System.out.println("for real numbers "
                         + a + ", " + b + ", " + c); 
        }  
        else
            System.out.println("Nesbitts inequality"
                                + " not satisfied"); 
    } 
} 
  
// This code is contributed by JaideepPyne. 

