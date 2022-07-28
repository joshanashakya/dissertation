

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
static int SIZE = 26; 
  
// Function to print the even frequency characters 
// in the order of their occurrence 
static void printChar(String str, int n) 
{ 
  
    // To store the frequency of each of 
    // the character of the string 
    int []freq = new int[SIZE]; 
  
    // Update the frequency of each character 
    for (int i = 0; i < n; i++) 
        freq[str.charAt(i) - 'a']++; 
  
    // Traverse str character by character 
    for (int i = 0; i < n; i++)  
    { 
  
        // If frequency of current character is even 
        if (freq[str.charAt(i) - 'a'] % 2 == 0) 
        { 
            System.out.print(str.charAt(i)); 
        } 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "geeksforgeeks"; 
    int n = str.length(); 
    printChar(str, n); 
} 
}  
  
// This code is contributed by 29AjayKumar 

