

// Java program to find longest contiguous 
// subset in binary representation of given 
// two numbers n and m 
public class GFG 
{     
    // utility function to check all the 
    // substrings and get the longest substring. 
    static int longestCommon(int n, int m) 
    {  
        int mx = -Integer.MAX_VALUE; // maximum length 
        String s1 = Integer.toBinaryString(n); 
        String s2 = Integer.toBinaryString(m); 
          
        String res = null;  // final resultant string 
        int len = s1.length(); 
        int l = len; 
          
        // for every substring of s1, 
        // check if its length is greater than 
        // previously found string 
        // and also it is present in string s2 
        while (len > 0) 
        { 
            for (int i = 0; i < l - len + 1; i++) 
            { 
                String temp = s1.substring(i, i + len); 
                  
                int tlen = temp.length(); 
                if (tlen > mx && s2.contains(temp)) 
                { 
                    res = temp; 
                    mx = tlen; 
                } 
            } 
              
            len = len - 1; 
        } 
          
        // If there is no common string 
        if(res == "") 
            return -1; 
          
        return Integer.parseInt(res,2); 
    } 
      
    // driver program to test above function 
    public static void main(String[] args)  
    { 
        int n = 10; 
        int m = 11; 
        System.out.println("Longest common decimal value : "
                            +longestCommon(m, n)); 
    } 
} 
  
// This code is Contributed by Sumit Ghosh 

