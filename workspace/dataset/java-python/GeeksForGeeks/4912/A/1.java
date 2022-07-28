

// Java implementation of the approach 
class GFG  
{ 
  
// function to modify the string 
    static void convert_str(String str, int k) 
    { 
        // length of the string 
        char[] s = str.toCharArray(); 
        int l = s.length; 
  
        for (int i = 0; i < l; i++)  
        { 
            int ascii = (int) s[i]; 
  
            // check if the character is 
            // lowercase and co-prime with k 
            if (ascii >= 'a' && ascii <= 'z' 
                    && __gcd(ascii, k) == 1) 
            { 
  
                // change the character 
                // to upper-case 
                char c = (char) (s[i] - 32); 
                s[i] = c; 
            } 
        } 
        System.out.println(String.valueOf(s)); 
    } 
  
    static int __gcd(int a, int b)  
    { 
        // Everything divides 0  
        if (a == 0)   
        { 
            return b; 
        } 
        if (b == 0)  
        { 
            return a; 
        } 
  
        // base case  
        if (a == b)  
        { 
            return a; 
        } 
  
        // a is greater  
        if (a > b)  
        { 
            return __gcd(a - b, b); 
        } 
        return __gcd(a, b - a); 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String s = "geeksforgeeks"; 
        int k = 4; 
        convert_str(s, k); 
    } 
}  
  
// This code is contributed by 29AjayKumar 

