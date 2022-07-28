

// Java implementation of above approach  
class GFG { 
  
    // check whether the first string can be  
    // converted to the second string  
    // by increasing the ASCII value of prefix  
    // string of first string  
    static boolean find(String s1, String s2) 
    { 
        // length of two strings  
        int len = s1.length(), len_1 = s2.length(); 
  
        // If lengths are not equal  
        if (len != len_1)  
        { 
            return false; 
        } 
  
        // store the difference of ASCII values  
        int d[] = new int[len]; 
  
        // difference of first element  
        d[0] = s2.charAt(0) - s1.charAt(0); 
  
        // traverse through the string  
        for (int i = 1; i < len; i++) 
        { 
  
            // the ASCII value of the second string  
            // should be greater than or equal to first  
            // string, if it is violated return false.  
            if (s1.charAt(i) > s2.charAt(i)) 
            { 
                return false; 
            }  
            else
            { 
  
                // store the difference of ASCII values  
                d[i] = s2.charAt(i) - s1.charAt(i); 
            } 
        } 
  
        // the difference of ASCII values should be  
        // in descending order  
        for (int i = 0; i < len - 1; i++)  
        { 
  
            // if the difference array is not in descending order  
            if (d[i] < d[i + 1]) 
            { 
                return false; 
            } 
        } 
  
        // if all the ASCII values of characters    
        // of first string is less than or equal to    
        // the second string and the difference array   
        // is in descending order, return true  
        return true; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        // create two strings  
        String s1 = "abcd", s2 = "bcdd"; 
  
        // check whether the first string can be  
        // converted to the second string  
        if (find(s1, s2))  
        { 
            System.out.println("Yes"); 
        } else 
        { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code is contributed by PrinciRaj1992  

