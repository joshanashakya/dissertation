

// Java program to reduce the string by 
// removing the characters which 
// appears less than k times 
class GFG { 
  
    final static int MAX_CHAR = 26; 
  
// Function to reduce the string by 
// removing the characters which 
// appears less than k times 
    static String removeChars(String str, int k) { 
        // Hash table initialised to 0 
        int hash[] = new int[MAX_CHAR]; 
  
        // Increment the frequency of the character 
        int n = str.length(); 
        for (int i = 0; i < n; ++i) { 
            hash[str.charAt(i) - 'a']++; 
        } 
  
        // create a new empty string 
        String res = ""; 
        for (int i = 0; i < n; ++i) { 
  
            // Append the characters which 
            // appears more than equal to k times 
            if (hash[str.charAt(i) - 'a'] >= k) { 
                res += str.charAt(i); 
            } 
        } 
  
        return res; 
    } 
  
// Driver Code 
    static public void main(String[] args) { 
        String str = "geeksforgeeks"; 
        int k = 2; 
  
        System.out.println(removeChars(str, k)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

