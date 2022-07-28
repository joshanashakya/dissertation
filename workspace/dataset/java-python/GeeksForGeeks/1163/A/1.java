

// Java implementation of the approach 
class GFG { 
  
    // Function that return true 
    // if character ch is a vowel 
    static boolean isVowel(char ch) 
    { 
        switch (ch) { 
        case 'a': 
        case 'e': 
        case 'i': 
        case 'o': 
        case 'u': 
            return true; 
        default: 
            return false; 
        } 
    } 
  
    // Function to return the count of adjacent 
    // vowel pairs in the given string 
    static int vowelPairs(String s, int n) 
    { 
        int cnt = 0; 
        for (int i = 0; i < n - 1; i++) { 
  
            // If current character and the 
            // character after it are both vowels 
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1))) 
                cnt++; 
        } 
  
        return cnt; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        String s = "abaebio"; 
        int n = s.length(); 
        System.out.print(vowelPairs(s, n)); 
    } 
} 

