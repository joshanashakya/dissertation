

// JAVA Program to Encrypt String with product of  
// number of vowels and consonants in subString 
// of size k 
class GFG  
{ 
  
    // isVowel() is a function that returns true 
    // for a vowel and false otherwise. 
    static boolean isVowel(char c)  
    { 
        return (c == 'a' || c == 'e' || 
                c == 'i' || c == 'o' ||  
                c == 'u'); 
    } 
  
    // function to Encrypt the String 
    static String encryptString(char[] s, int n, int k) 
    { 
        // cv to count vowel 
        // cc to count consonants 
        int[] cv = new int[n]; 
        int[] cc = new int[n]; 
  
        if (isVowel(s[0])) 
            cv[0] = 1; 
        else
            cc[0] = 1; 
  
        // Counting prefix count of vowel 
        // and prefix count of consonants 
        for (int i = 1; i < n; i++) 
        { 
            cv[i] = cv[i - 1] + (isVowel(s[i]) == true ? 1 : 0); 
            cc[i] = cc[i - 1] + (isVowel(s[i]) == true ? 0 : 1); 
        } 
  
        String ans = ""; 
        int prod = 0; 
  
        prod = cc[k - 1] * cv[k - 1]; 
        ans += String.valueOf(prod); 
  
        // generating the encrypted String. 
        for (int i = k; i < s.length; i++)  
        { 
            prod = (cc[i] - cc[i - k]) *  
                   (cv[i] - cv[i - k]); 
            ans += String.valueOf(prod); 
        } 
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        String s = "hello"; 
        int n = s.length(); 
        int k = 2; 
  
        System.out.print(encryptString(s.toCharArray(), n, k) + "\n"); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

