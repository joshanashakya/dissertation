

// Java program to count number of ways of 
// removing a substring from a string such  
// that all remaining characters are equal 
import java.util.*; 
  
class solution 
{ 
  
// Function to return the number of ways  
// of removing a sub-string from s such 
// that all the remaining characters are same 
static int no_of_ways(String s) 
{ 
    int n = s.length(); 
  
    // To store the count of prefix and suffix 
    int count_left = 0, count_right = 0; 
  
    // Loop to count prefix 
    for (int i = 0; i < n; ++i) { 
        if (s.charAt(i) == s.charAt(0)) { 
            ++count_left; 
        } 
        else
            break; 
    } 
  
    // Loop to count suffix 
    for (int i = n - 1; i >= 0; --i) { 
        if (s.charAt(i) == s.charAt(n - 1)) { 
            ++count_right; 
        } 
        else
            break; 
    } 
  
    // First and last characters of the 
    // string are same 
    if (s.charAt(0) == s.charAt(n - 1)) 
        return ((count_left + 1) * (count_right + 1)); 
  
    // Otherwise 
    else
        return (count_left + count_right + 1); 
} 
  
// Driver function 
public static void main(String args[]) 
{ 
    String s = "geeksforgeeks"; 
    System.out.println(no_of_ways(s)); 
  
} 
} 

