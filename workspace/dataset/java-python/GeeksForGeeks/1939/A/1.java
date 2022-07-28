

// Java implementation of the approach  
class GFG 
{ 
  
// Function that returns true if s  
// can be made lexicographically smaller  
// by reversing a sub-string in s  
static boolean check(String s)  
{  
    int n = s.length();  
  
    // Traverse in the string  
    for (int i = 0; i < n - 1; i++) 
    {  
  
        // Check if s[i+1] < s[i]  
        if (s.charAt(i) > s.charAt(i + 1))  
            return true;  
    }  
  
    // Not possible  
    return false;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    String s = "geeksforgeeks";  
  
    if (check(s))  
        System.out.println("Yes");  
    else
        System.out.println("No");  
  
}  
} 
  
// This code is contributed by Arnab Kundu 

