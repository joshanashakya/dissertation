

// Java Program to find double factorial  
// of given number 
import java .io.*; 
  
class GFG { 
      
    // function to find double factorial 
    // of given number 
    static int doublefactorial(int n) 
    { 
        int res = 1; 
        for (int i = n; i >= 0; i = i-2) 
        { 
            if (i == 0 || i == 1) 
                return res; 
            else
                res *= i; 
        } 
          
        return res; 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
        System.out.println("Double factorial"
             + " is " + doublefactorial(5)); 
    } 
} 
  
// This code is Contributed by Anuj_67  

