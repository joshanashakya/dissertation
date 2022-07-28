

// java implementation to check 
// if the number is plus perfect  
// or not 
import java.io.*; 
  
class GFG { 
      
    // function to check plus perfect number 
    static boolean checkplusperfect(int x) 
    { 
        int temp = x; 
          
        // calculating number of digits 
        int n = 0; 
        while (x != 0)  
        { 
            x /= 10; 
            n++; 
        }  
          
        // calculating plus perfect number 
        x = temp; 
        int sum = 0; 
        while (x != 0)  
        { 
            sum += Math.pow(x % 10, n); 
            x /= 10; 
        } 
          
        // checking whether number  
        // is plus perfect or not 
        return (sum == temp); 
    } 
      
    // Driver program 
    public static void main (String[] args)  
    { 
        int x = 9474; 
        if (checkplusperfect(x)) 
            System.out.println ( "Yes"); 
        else
            System.out.println ( "No");  
      
    } 
} 
  
// This code is contributed by vt_m 

