

// Java program to find the longest 
// subsequence containing only vowels 
class GFG{ 
   
// Function to check whether 
// a character is vowel or not 
static boolean isVowel(char x) 
{ 
    x = Character.toLowerCase(x); 
   
    // Returns true if x is vowel 
    return (x == 'a' || x == 'e'
            || x == 'i' || x == 'o'
            || x == 'u'); 
} 
   
// Function to find the longest subsequence 
// which contain all vowels 
static String longestVowelSubsequence(String str) 
{ 
    String answer = ""; 
   
    // Length of the String 
    int n = str.length(); 
   
    // Iterating through the String 
    for (int i = 0; i < n; i++) { 
   
        // Checking if the character is a 
        // vowel or not 
        if (isVowel(str.charAt(i))) { 
   
            // If it is a vowel, then add it 
            // to the final String 
            answer += str.charAt(i); 
        } 
    }  
    return answer; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String str = "geeksforgeeks"; 
    System.out.print(longestVowelSubsequence(str) 
 +"\n"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

