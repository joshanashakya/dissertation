

// Java program to check if there is a substring  
// palindrome of even length.  
  
class GFG { 
  
  
// function to check if two consecutive same  
// characters are present  
static boolean check(String s)  
{  
    for (int i = 0; i < s.length() - 1; i++)  
        if (s.charAt(i) == s.charAt(i+1))  
            return true;  
    return false;  
}  
  
// Driver Code  
    public static void main(String[] args) { 
  
        String s = "xzyyz";  
    if (check(s))  
              System.out.println("YES"); 
    else
        System.out.println("NO"); 
    } 
} 

