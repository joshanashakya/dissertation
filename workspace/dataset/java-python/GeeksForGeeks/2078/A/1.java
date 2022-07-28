

/// An optimized method based Java 
// program to check if a number  
// is Composite or not. 
import java.io.*; 
  
class Composite 
{ 
    static boolean isComposite(int n) 
    { 
        // Corner cases 
        if (n <= 1)  
        System.out.println("False"); 
          
        if (n <= 3)  
        System.out.println("False"); 
  
        // This is checked so that we can skip  
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) return true; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
            return true; 
  
        return false; 
    } 
  
    // Driver Program to test above function 
    public static void main(String args[]) 
    { 
        System.out.println(isComposite(11) ? 
                       "true" : "false"); 
                         
        System.out.println(isComposite(15) ? 
                       "true" : "false"); 
    } 
} 
  
// This code is contributed by Anshika Goyal 

