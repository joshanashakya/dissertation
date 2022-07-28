

// java Program to find closest 
// multiple of x to a^b 
import java.io.*; 
  
public class GFG { 
  
    // function to find closest 
    // multiple of x to a^b  
    static void multiple(int a, int b, int x) 
    {  
        if (b < 0) 
        { 
            if (a == 1 && x == 1) 
                System.out.println("1"); 
            else
                System.out.println("0"); 
        } 
      
        // calculate a ^ b / x 
        int mul = (int)Math.pow(a, b); 
          
        int ans = mul / x;  
          
        // Answer is either (ans * x) or  
        // (ans + 1) * x  
        int ans1 = x * ans; 
        int ans2 = x * (ans + 1); 
      
        // Printing nearest answer 
        System.out.println(((mul - ans1) 
                        <= (ans2 - mul)) 
                         ? ans1 : ans2); 
    } 
      
    // Driver Program 
    static public void main (String[] args) 
    { 
        int a = 349, b = 1, x = 4; 
  
        multiple(a, b, x); 
    } 
} 
  
// This code is contributed by vt_m.  

