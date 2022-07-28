

// Java program to check if we can rearrange a  
// string such that it has alternate 0s and 1s.  
import java.lang.Math; 
  
public class GfG{ 
      
    // function to check the binary string  
    public static boolean is_possible(String s) 
    {  
        // length of string  
        int l = s.length();  
        
        int one = 0, zero = 0;  
        
        for (int i = 0; i < l; i++) {  
        
            // count zero's  
            if (s.charAt(i) == '0')  
                zero++;  
        
            // count one's  
            else
                one++;  
        }  
        
        // if length is even  
        if (l % 2 == 0)   
            return (one == zero);  
        
        // if length is odd  
        else 
            return (Math.abs(one - zero) == 1);  
    }  
  
    public static void main(String []args){ 
          
        String s = "100110";  
        if (is_possible(s))  
          System.out.println("Yes");  
        else
          System.out.println("No");  
    } 
} 
  
// This code is contributed by Rituraj Jain 

