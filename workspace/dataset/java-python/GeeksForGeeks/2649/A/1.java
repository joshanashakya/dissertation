

// Java program to count common 
// base strings of s1 and s2.  
  
class GFG  
{ 
  
// function for finding common divisor  
static boolean isCommonBase(String base,  
                            String s1,  
                            String s2) 
{ 
    // Checking if 'base' is base  
    // String of 's1'  
    for (int j = 0; j < s1.length(); ++j)  
    { 
        if (base.charAt(j %  
            base.length()) != s1.charAt(j)) 
        { 
            return false; 
        } 
    } 
  
    // Checking if 'base' is base  
    // String of 's2'  
    for (int j = 0; j < s2.length(); ++j)  
    { 
        if (base.charAt(j %  
            base.length()) != s2.charAt(j))  
        { 
            return false; 
        } 
    } 
  
    return true; 
} 
  
static int countCommonBases(String s1,  
                            String s2)  
{ 
    int n1 = s1.length(),  
        n2 = s2.length(); 
    int count = 0; 
    for (int i = 1; i <= Math.min(n1, n2); i++)  
    { 
        String base = s1.substring(0, i); 
        if (isCommonBase(base, s1, s2))  
        { 
            count++; 
        } 
    } 
    return count; 
} 
  
// Driver code  
public static void main(String[] args) 
{ 
    String s1 = "pqrspqrs"; 
    String s2 = "pqrspqrspqrspqrs"; 
  
    System.out.println(countCommonBases(s1, s2)); 
} 
} 
  
// This code is contributed by Rajput-JI  

