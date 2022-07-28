

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
      
    // Function to return the minimum number  
    // of operations on a binary string such that  
    // it gives 10^A as remainder when divided by 10^B  
    static int findCount(String s, int n, int a, int b)  
    {  
        // Initialize result  
        int res = 0;  
        char []s1 = s.toCharArray(); 
          
        // Loop through last b digits  
        for (int i = 0; i < b; i++) 
        {  
              
            if (i == a)  
            { 
                if (s1[n - i - 1] != '1') 
                    res += 1;  
            } 
            else
            { 
                if (s1[n - i - 1] != '0') 
                        res += 1 ; 
            } 
                  
        }  
      
        return res;  
    }  
      
    // Driver code 
    static public void main (String []args) 
    { 
          
        String str = "1001011001";  
        int N = str.length() ;  
        int A = 3, B = 6;  
      
        System.out.println(findCount(str, N, A, B));  
      
    } 
} 
  
// This code is contributed by ChitraNayal 

