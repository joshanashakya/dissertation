

// java program to find n-th number 
// containing only 3 and 5. 
public class GFG { 
  
    static String findNthNo(int n) 
    { 
        String res = ""; 
        while (n >= 1) { 
  
            // If n is odd, append 
            // 3 and move to parent 
            if ((n & 1) == 1) { 
                res = res + "3"; 
                n = (n - 1) / 2; 
            } 
  
            // If n is even, append 
            // 5 and move to parent 
            else { 
                res = res + "5"; 
                n = (n - 2) / 2; 
            } 
        } 
  
        // Reverse res and return. 
        StringBuilder sb = new StringBuilder(res); 
        sb.reverse(); 
        return new String(sb); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 5; 
  
        System.out.print(findNthNo(n)); 
    } 
} 

