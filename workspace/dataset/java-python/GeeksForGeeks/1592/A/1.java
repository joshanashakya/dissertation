

// Java program for finding  
// the Special Factorial Number  
public class GFG { 
  
// function for calculating factoial  
    static int fact(int n) { 
        int num = 1; 
  
        for (int i = 1; i <= n; i++) { 
            num = num * i; 
        } 
  
        return num; 
    } 
  
// function for check Special_Factorial_Number  
    static int Special_Factorial_Number(int k) { 
  
        for (int i = 1; i <= k; i++) { 
            // call fact function and the  
            // Modulo with k and check  
            // if condition is TRUE then return i  
            if (fact(i) % k == 0) { 
                return i; 
            } 
        } 
        return 0; 
    } 
  
//driver function  
    public static void main(String[] args) { 
        // taking input  
        int k = 16; 
        System.out.println(Special_Factorial_Number(k)); 
  
    } 
} 
  
/*This code is contributed by Rajput-Ji*/

