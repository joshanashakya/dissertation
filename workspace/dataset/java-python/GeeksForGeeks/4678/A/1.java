

//Java program for finding the sum 
//of first N terms of the series. 
  
public class GFG { 
  
    //CalculateSum function returns the final sum 
    static int calculateSum(int n) 
    { 
     // r1 and r2 are common ratios 
     // of 1st and 2nd series 
     int r1 = 2, r2 = 3; 
  
     // a1 and a2 are common first terms 
     // of 1st and 2nd series 
     int a1 = 1, a2 = 1; 
  
     return (int)(a1 * (Math.pow(r1, n) - 1) / (r1 - 1) 
            + a2 * (Math.pow(r2, n) - 1) / (r2 - 1)); 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
          
        int n = 4; 
  
         // function calling for 4 terms 
         System.out.println("Sum = " +calculateSum(n)); 
    } 
} 

