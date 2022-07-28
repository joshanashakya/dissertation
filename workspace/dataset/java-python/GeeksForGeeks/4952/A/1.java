

// java implementation of above approach  
  
public class GFG { 
      
    // Function to calculate the GCD 
    static int GCD(int a, int b) { 
           if (b==0) return a; 
           return GCD(b,a%b); 
        } 
      
    // Function to find the ratio  
    static void findRatio(int m,int  n) 
    { 
        int Am = m - 5, An = n - 5 ; 
          
        // divide numerator by GCD to get  
        // smallest fractional value  
        int numerator = Am / GCD(Am, An) ; 
          
        // divide denominator by GCD to get  
        // smallest fractional value  
        int denominator = An / GCD(Am, An) ; 
          
        System.out.println(numerator + "/" + denominator); 
    } 
    // Driver code  
    public static void main (String args[]){ 
          
        // let d=1 as d doesn't affect ratio   
        int m = 10, n = 20;  
            
            findRatio(m, n);  
            
    } 
  
// This code is contributed by ANKITRAI1 
} 

