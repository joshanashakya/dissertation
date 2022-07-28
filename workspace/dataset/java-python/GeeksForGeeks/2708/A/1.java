

// Java program to remove characters from 
// a String that appears exactly K times 
import java.util.*; 
  
class GFG{ 
   
static int MAX_CHAR = 26; 
   
// Function to reduce the String by 
// removing the characters which 
// appears exactly k times 
static String removeChars(char arr[], int k) 
{ 
    // Hash table initialised to 0 
    int []hash = new int[MAX_CHAR]; 
   
    // Increment the frequency 
    // of the character 
    int n = arr.length; 
    for (int i = 0; i < n; ++i) 
        hash[arr[i] - 'a']++; 
   
    // To store answer 
    String ans = ""; 
  
    for (int i = 0; i < n; ++i) { 
   
        // Append the characters which 
        // appears exactly k times 
        if (hash[arr[i] - 'a'] != k) { 
            ans += arr[i]; 
        } 
    } 
   
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    char str[] = "geeksforgeeks".toCharArray(); 
    int k = 2; 
   
    // Function call 
    System.out.print(removeChars(str, k)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

