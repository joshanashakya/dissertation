

// Java program to determine minimum number 
// of rotations required to yield same 
// string. 
  
import java.util.*; 
  
class GFG 
{ 
    // Returns count of rotations to get the 
    // same string back. 
    static int findRotations(String str) 
    { 
        // tmp is the concatenated string. 
        String tmp = str + str; 
        int n = str.length(); 
      
        for (int i = 1; i <= n; i++) 
        { 
      
            // substring from i index of original 
            // string size. 
              
            String substring = tmp.substring(i, str.length()); 
      
            // if substring matches with original string 
            // then we will come out of the loop. 
            if (str == substring) 
                return i; 
        } 
        return n; 
    } 
  
    // Driver Method 
    public static void main(String[] args) 
    { 
            String str = "abc"; 
        System.out.println(findRotations(str)); 
    } 
} 
/* This code is contributed by Mr. Somesh Awasthi */

