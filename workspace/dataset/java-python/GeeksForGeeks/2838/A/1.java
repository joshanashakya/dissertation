

// Java program to find first subString 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find first subString 
static String first_subString(String s) 
{ 
    int n = s.length(), c = 0; 
    String s1, s2; 
    HashMap<String, Integer> mpp =  
        new HashMap<String, Integer>(); 
  
    // Storing the words present in String 
    for (int i = 0; i < n; i++)  
    { 
        if (s.charAt(i) == ' ' || s.charAt(i) == '#') 
        { 
            s1 = s.substring(c, i); 
            mpp.put(s1, 1); 
            c = i + 1; 
        } 
    } 
  
    // Calculating for all 
    // possible valid subString. 
    for (int i = 0; i < n; i++)  
    { 
        if (s.charAt(i) == ' ') 
        { 
            continue; 
        } 
        for (int j = 0; j < n; j++)  
        { 
            if (s.charAt(i) == ' ')  
            { 
                break; 
            } 
            s1 = s.substring(i, j - i + 1); 
            s2 = s1; 
            s1 = reverse(s1); 
            if (mpp.containsKey(s1))  
            { 
                return s2; 
            } 
        } 
    } 
    return "-1"; 
} 
static String reverse(String input)  
{ 
    char[] a = input.toCharArray(); 
    int l, r = a.length - 1; 
    for (l = 0; l < r; l++, r--)  
    { 
        char temp = a[l]; 
        a[l] = a[r]; 
        a[r] = temp; 
    } 
    return String.valueOf(a); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String s, s1; 
    s = "mango is sweet when nam en tastes it#"; 
    s1 = first_subString(s); 
    System.out.print(s1+ "\n"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

