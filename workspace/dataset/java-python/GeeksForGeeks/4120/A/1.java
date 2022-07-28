

// Java program to check if  
// characters of one string 
// can be swapped to form other 
class GFG 
{ 
static int MAX = 26; 
  
static boolean targetstring(String str1,  
                            String str2) 
{ 
    int l1 = str1.length(); 
    int l2 = str2.length(); 
  
    // if length is not same print no 
    if (l1 != l2) 
        return false; 
  
    int []map = new int[MAX]; 
      
    // Count frequencies of  
    // character in first string. 
    for (int i = 0; i < l1; i++) 
        map[str1.charAt(i) - 'a']++; 
  
    // iterate through the second 
    // string decrement counts of  
    // characters in second string 
    for (int i = 0; i < l2; i++)  
    { 
        map[str2.charAt(i) - 'a']--; 
  
        // Since lengths are same,  
        // some value would definitely  
        // become negative if result  
        // is false. 
        if (map[str2.charAt(i) - 'a'] < 0) 
            return false; 
    } 
  
    return true; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    String str1 = "geeksforgeeks"; 
    String str2 = "geegeeksksfor"; 
    if (targetstring(str1, str2)) 
        System.out.print("YES"); 
    else
        System.out.print("NO"); 
} 
} 
  
// This code is contributed by  
// Akanksha Rai 

