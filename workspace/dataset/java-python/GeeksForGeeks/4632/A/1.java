

// Java program for nth Fibonacci word 
import java.util.*; 
  
class Eulerian 
{ 
    // Returns n-th Fibonacci word 
    public static String fibWord(int n) 
    { 
        String Sn_1 = "0"; 
        String Sn = "01"; 
        String tmp; 
        for (int i=2; i<=n; i++) 
        { 
            tmp = Sn; 
            Sn += Sn_1; 
            Sn_1 = tmp; 
        } 
  
        return Sn; 
    } 
      
    // driver code 
    public static void main(String[] args) 
    { 
        int n = 6; 
        System.out.print(fibWord(n)); 
    } 
} 
  
// This code is contributed by rishabh_jain 

