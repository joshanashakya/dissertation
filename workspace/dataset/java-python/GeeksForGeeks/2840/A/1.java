

// Java implementation of the approach  
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the factorial of n 
static int fact(int n) 
{ 
    int fact = 1; 
    for (int i = 1; i <= n; i++) 
        fact *= i; 
  
    return fact; 
} 
  
// Function to return the count of all 
// possible strings that can be formed 
// with the characters of the given string 
// without repeating characters 
static int countStrings(String str, int n) 
{ 
  
    // To store the distinct characters 
    // of the string str 
    Set<Character> distinct_char = new HashSet<>(); 
    for (int i = 0; i < n; i++)  
    { 
        distinct_char.add(str.charAt(i)); 
    } 
  
    return fact(distinct_char.size()); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "geeksforgeeks"; 
    int n = str.length(); 
  
    System.out.println(countStrings(str, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

