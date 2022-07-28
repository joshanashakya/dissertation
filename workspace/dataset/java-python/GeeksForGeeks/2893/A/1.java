

// Java program  to find number of digits in nth 
// Fibonacci number 
  
class GFG  
{ 
    // This function returns the number of digits 
    // in nth Fibonacci number after ceiling it 
    // Formula used (n * log(phi) - (log 5) / 2) 
    static double numberOfDigits(double n) 
    { 
        if (n == 1) 
            return 1; 
      
        // using phi = 1.6180339887498948 
        double d = (n * Math.log10(1.6180339887498948)) - 
                   ((Math.log10(5)) / 2); 
      
        return Math.ceil(d); 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        double i; 
        for (i = 1; i <= 10; i++) 
        System.out.println("Number of Digits in F("+i+") - " 
                           +numberOfDigits(i)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

