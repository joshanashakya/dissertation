

// Java program for Arrangement of words 
// without changing the relative position of  
// vowel and consonants  
  
class GFG 
{ 
      
    // this function return n! 
    static long factorial(long n) 
    { 
        long res = 1; 
        for (int i = 1; i <= n; i++) 
            res = res * i; 
      
        return res; 
    } 
      
    // this will return total number of ways 
    static long count(String word) 
    { 
      
        // freq maintains frequency 
        // of each character in word 
        int freq[] =new int[27]; 
          
        for(int i=0;i<27;i++) 
            freq[i]=0; 
      
        long vowel = 0, consonant = 0; 
        for (int i = 0; i < word.length(); i++) { 
            freq[word.charAt(i) - 'A']++; 
      
            // check character is vowel or not 
            if (word.charAt(i) == 'A' || word.charAt(i) == 'E'
                || word.charAt(i) == 'I'
                || word.charAt(i) == 'O' || word.charAt(i) == 'U') { 
                vowel++; 
            } 
      
            // the characters that are not vowel 
            // must be consonant 
            else
                consonant++; 
        } 
      
        // number of ways to arrange vowel 
        long vowelArrange; 
        vowelArrange = factorial(vowel); 
        vowelArrange /= factorial(freq[0]); 
        vowelArrange /= factorial(freq[4]); 
        vowelArrange /= factorial(freq[8]); 
        vowelArrange /= factorial(freq[14]); 
        vowelArrange /= factorial(freq[20]); 
      
        long consonantArrange; 
        consonantArrange = factorial(consonant); 
        for (int i = 0; i < 26; i++) { 
            if (i != 0 && i != 4 && i != 8 && i != 14 && i != 20) 
                consonantArrange /= factorial(freq[i]); 
        } 
      
        // multiply both as these are independent 
        long total = vowelArrange * consonantArrange; 
        return total; 
    } 
      
    // Driver function 
    public static void main(String []args) 
    { 
        // string contains only 
        // capital letters 
        String word = "COMPUTER"; 
      
        // this will contain ans 
        long ans = count(word); 
        System.out.println(ans); 
  
    } 
  
} 
  
// This code is contributed by ihritik 

