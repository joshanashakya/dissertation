

// Java program to find required minimum digits 
// need to remove to make a number perfect squre 
import java.io.*; 
import java.lang.*; 
  
public class GFG { 
      
    // function to check minimum  
    // number of digits should  
    // be removed to make this  
    // number a perfect square 
    static int perfectSquare(String s) 
    { 
        // size of the string 
        int n = s.length(); 
      
        // our final answer 
        int ans = -1; 
      
        // to store string which 
        // is perfect square. 
        String num = ""; 
      
        // We make all possible subsequences 
        for (int i = 1; i < (1 << n); i++) { 
            String str = ""; 
              
            for (int j = 0; j < n; j++) { 
                  
                // to check jth bit is set or not. 
                if (((i >> j) & 1) == 1) { 
                    str += s.charAt(j); 
                } 
            } 
      
            // we do not consider a number  
            // with leading zeros 
            if (str.charAt(0) != '0') { 
                  
                // convert our temporary 
                // string into integer 
                int temp = 0; 
                for (int j = 0; j <  
                              str.length(); j++) 
                    temp = temp * 10 +  
                      (int)(str.charAt(j) - '0'); 
      
                int k = (int)Math.sqrt(temp); 
      
                // checking temp is perfect 
                // square or not. 
                if (k * k == temp) { 
                      
                    // taking maximum sized string 
                    if (ans < (int)str.length()) { 
                        ans = (int)str.length(); 
                        num = str; 
                    } 
                } 
            } 
        } 
      
        if (ans == -1) 
            return ans; 
        else { 
              
            // print PerfectSquare 
            System.out.print(num + " "); 
            return n - ans; 
        } 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        System.out.println(perfectSquare("8314")); 
        System.out.println(perfectSquare("753")); 
    } 
} 
  
// This code is contributed by  
// Manish Shaw (manishshaw1) 

