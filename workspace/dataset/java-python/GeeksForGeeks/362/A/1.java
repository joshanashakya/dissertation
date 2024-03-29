

// Most optimized Java program to  
// check if a number is prime 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
      
    //check for number prime or not 
    static boolean isPrime(int n) { 
    //check if n is a multiple of 2 
    if (n%2==0) return false; 
    //if not, then just check the odds 
    for(int i=3;i<=Math.sqrt(n);i+=2) { 
        if(n%i==0) 
            return false; 
    } 
    return true; 
} 
      
    // Driver Program 
    public static void main(String[] args)  
    { 
         if(isPrime(19))  
         System.out.println(" true") ; 
          
         else 
         System.out.println(" false"); 
           
    } 
} 
      
// This code is contributed by Ronak Bhensdadia    

