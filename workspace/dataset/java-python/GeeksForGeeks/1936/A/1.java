

// Java Program to find ith  
// character in a binary String. 
import java.io.*; 
import java.util.Arrays; 
  
class GFG 
{ 
static String s = ""; 
static String ReverseString(String s) 
{ 
    char[] arr = s.toCharArray(); 
    for(int i = 0; 
            i < arr.length / 2; i++) 
    { 
        char temp = arr[i];  
        arr[i] = arr[arr.length - i -1];  
        arr[arr.length - i - 1] = temp;  
    } 
    return new String(arr); 
} 
  
// Function to store 
// binary Representation 
static void binary_conversion(int m)  
{ 
    while (m != 0)  
    { 
        int tmp = m % 2; 
        s += Integer.toString(tmp); 
        m = (int)(m / 2); 
    } 
      
    s = ReverseString(s); 
} 
  
// Function to find  
// ith character 
static int find_character(int n,  
                          int m,  
                          int i)  
{      
    // Function to change 
    // decimal to binary 
    binary_conversion(m); 
  
    String s1 = ""; 
    for (int x = 0; x < n; x++)  
    { 
        for (int y = 0;  
                 y < s.length(); y++)  
        { 
            if (s.charAt(y) == '1')  
            s1 += "10"; 
            else
            s1 += "01";      
        } 
          
        // Assign s1 String  
        // in s String 
        s = s1; 
        s1 = ""; 
    } 
      
    return s.charAt(i) - '0'; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int m = 5, n = 2, i = 8; 
    System.out.print( 
               find_character(n, m, i)); 
} 
} 
  
// This code is contributed by  
// Manish Shaw(manishshaw1) 

