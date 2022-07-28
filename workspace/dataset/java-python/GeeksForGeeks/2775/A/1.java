

// Java Program to Encrypt String with product  
// of number of vowels and consonants in every  
// substring of size k  
  
class GFG { 
  
// isVowel() is a function that returns true  
// for a vowel and false otherwise.  
    static boolean isVowel(char c) { 
        return (c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u'); 
    } 
  
// function to Encrypt the dtring  
    static String encryptString(String s, int n, int k) { 
        int countVowels = 0; 
        int countConsonants = 0; 
        String ans = ""; 
  
        // for each substring  
        for (int l = 0; l <= n - k; l++) { 
            countVowels = 0; 
            countConsonants = 0; 
  
            // substring of size k  
            for (int r = l; r <= l + k - 1; r++) { 
  
                // counting number of vowels and  
                // consonants  
                if (isVowel(s.charAt(r)) == true) { 
                    countVowels++; 
                } else { 
                    countConsonants++; 
                } 
            } 
  
            // append product to answer.  
            ans += String.valueOf(countVowels * countConsonants); 
        } 
        return ans; 
    } 
  
// Driven Program  
    static public void main(String[] args) { 
        String s = "hello"; 
        int n = s.length(); 
        int k = 2; 
        System.out.println(encryptString(s, n, k)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

