

// Java implementation of 
// above approach 
import java.io.*; 
  
// function to calculate minimum 
// characters to replace 
class GFG 
{ 
static int replace(String A, String B) 
{ 
  
    int n = A.length(), m = B.length(); 
    int count = 0, i, j; 
  
    for (i = 0; i < n; i++) 
    { 
        for (j = 0; j < m; j++)  
        { 
  
            // mismatch occurs 
            if(i + j >= n) 
            break; 
            else if (A.charAt(i + j) != B.charAt(j))  
                break; 
        } 
  
        // if all characters matched, i.e, 
        // there is a substring of 'a' which 
        // is same as string 'b' 
        if (j == m)  
        { 
            count++; 
  
            // increment i to index m-1 such that 
            // minimum characters are replaced 
            // in 'a' 
            i += m - 1; 
              
        } 
    } 
  
    return count; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    String str1 = "aaaaaaaa"; 
    String str2 = "aaa"; 
  
    System.out.println(replace(str1 , str2)); 
} 
} 
  
// This code is contributed by Subhadeep 

