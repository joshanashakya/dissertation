

// Java implementation of the approach 
class GFG 
{ 
  
    // Function to return the lexicographically 
    // largest sub-sequence of s 
    static String getSubSeq(String s, int n) 
    { 
        String res = ""; 
        int cr = 0; 
        while (cr < n)  
        { 
  
            // Get the max character from the String 
            char mx = s.charAt(cr); 
            for (int i = cr + 1; i < n; i++) 
            { 
                mx = (char) Math.max(mx, s.charAt(i)); 
            } 
            int lst = cr; 
  
            // Use all the occurrences of the 
            // current maximum character 
            for (int i = cr; i < n; i++)  
            { 
                if (s.charAt(i) == mx)  
                { 
                    res += s.charAt(i); 
                    lst = i; 
                } 
            } 
  
            // Repeat the steps for  
            // the remaining String 
            cr = lst + 1; 
        } 
        return res; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String s = "geeksforgeeks"; 
        int n = s.length(); 
        System.out.println(getSubSeq(s, n)); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

