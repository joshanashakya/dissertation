

// An efficient java program to check if binary 
// representations of n's predecessor and its 
// 1's complement are same. 
public class GFG { 
      
    // Returns true if binary representations of 
    // n's predecessor and it's 1's complement 
    // are same. 
    static boolean bit_check(int n) 
    { 
        if ((n & (n - 1)) == 0) 
            return true; 
        return false; 
    } 
   
    // Driver code     
    public static void main(String args[]) { 
          
         int n = 14; 
         if(bit_check(n)) 
            System.out.println ('1'); 
         else
            System.out.println('0'); 
           
    } 
} 
  
// This code is contributed by Sam007 

