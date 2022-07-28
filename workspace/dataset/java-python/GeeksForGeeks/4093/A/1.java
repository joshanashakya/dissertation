

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to return the string formed 
    // by the odd indexed characters of s 
    static String partOdd(String s)  
    { 
        String st = ""; 
        for (int i = 0; i < s.length(); i++) 
        { 
            if (i % 2 != 0) 
                st += s.charAt(i); 
        } 
  
        return st; 
    } 
  
    // Function to return the string formed 
    // by the even indexed characters of s 
    static String partEven(String str) 
    { 
        String s = ""; 
        for (int i = 0; i < str.length(); i++)  
        { 
            if (i % 2 == 0) 
                s += str.charAt(i); 
        } 
        return s; 
    } 
  
    // Function that returns true if s1 
    // can be made equal to s2 
    // with the given operation 
    static boolean canBeMadeEqual(String s1, 
                                  String s2) 
    { 
  
        // Get the string formed by the 
        // even indexed characters of s1 
        char[] even1 = partEven(s1).toCharArray(); 
  
        // Get the string formed by the 
        // even indexed characters of s2 
        char[] even2 = partEven(s2).toCharArray(); 
  
        // Get the string formed by the 
        // odd indexed characters of s1 
        char[] odd1 = partOdd(s1).toCharArray(); 
  
        // Get the string formed by the 
        // odd indexed characters of s2 
        char[] odd2 = partOdd(s2).toCharArray(); 
  
        // Sorting all the lists 
        Arrays.sort(even1); 
        Arrays.sort(even2); 
        Arrays.sort(odd1); 
        Arrays.sort(odd2); 
  
        String even_s1 = new String(even1); 
        String even_s2 = new String(even2); 
        String odd_s1 = new String(odd1); 
        String odd_s2 = new String(odd2); 
  
        // If the strings can be made equal 
        if (even_s1.equals(even_s2) &&  
             odd_s1.equals(odd_s2)) 
            return true; 
        return false; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String s1 = "cdab"; 
        String s2 = "abcd"; 
  
        if (canBeMadeEqual(s1, s2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

