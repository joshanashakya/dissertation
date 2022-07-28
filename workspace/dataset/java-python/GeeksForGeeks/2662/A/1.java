

// Java implementation of the approach  
class GFG  
{ 
  
    // Function that returns true if sub-string  
    // s[0...k] is repeated a number of times  
    // to generate String s  
    static boolean check(String s, int k) 
    { 
        for (int i = 0; i < s.length(); i++)  
        { 
            if (s.charAt(i) != s.charAt(i % k)) 
            { 
                return false; 
            } 
        } 
        return true; 
    } 
  
    // Function to return the 
    // count of common divisors  
    static int countCommonDivisors(String a, String b)  
    { 
        int ct = 0; 
        int n = a.length(), m = b.length(); 
        for (int i = 1; i <= Math.min(n, m); i++)  
        { 
  
            // If the length of the sub-string  
            // divides length of both the strings  
            if (n % i == 0 && m % i == 0)   
            { 
                // If prefixes match in both the strings 
                if (a.substring(0, i).equals(b.substring(0, i)))  
                // by repeating the current prefix  
                { 
                    // If both the strings can be generated  
                    if (check(a, i) && check(b, i))  
                    { 
                        ct++; 
                    } 
                } 
            } 
        } 
        return ct; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        String a = "xaxa", b = "xaxaxaxa"; 
        System.out.println(countCommonDivisors(a, b)); 
    } 
}  
  
// This code is contributed by PrinciRaj1992 

