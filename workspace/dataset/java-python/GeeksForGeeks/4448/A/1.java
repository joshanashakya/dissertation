

// Java implementation of lexicographically first  
// alternate vowel and consonant String  
import java.util.Arrays; 
class GFG { 
  
    static final int SIZE = 26; 
  
    // 'ch' is vowel or not  
    static boolean isVowel(char ch) 
    { 
        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') 
        { 
            return true; 
        } 
        return false; 
    } 
  
    // create alternate vowel and consonant String  
    // str1[0...l1-1] and str2[start...l2-1]  
    static String createAltStr(String str1, String str2, 
            int start, int l) 
    { 
        String finalStr = ""; 
  
        // first adding character of vowel/consonant  
        // then adding character of consonant/vowel  
        for (int i = 0, j = start; j < l; i++, j++)  
        { 
            finalStr = (finalStr + str1.charAt(i)) 
                    + str2.charAt(j); 
        } 
        return finalStr; 
    } 
  
    // function to find the required  
    // lexicographically  first alternate  
    // vowel and consonant String  
    static String findAltStr(String str) 
    { 
          
        // hash table to store frequencies  
        // of each character in 'str'  
        int char_freq[] = new int[SIZE]; 
  
        // initilaize all elements of char_freq[]  
        // to 0  
        Arrays.fill(char_freq, 0); 
  
        int nv = 0, nc = 0; 
        String vstr = "", cstr = ""; 
        int l = str.length(); 
  
        for (int i = 0; i < l; i++) 
        { 
            char ch = str.charAt(i); 
  
            // count vowels  
            if (isVowel(ch))  
            { 
                nv++; 
            }  
              
            // count consonants  
            else 
            { 
                nc++; 
            } 
  
            // update frequency of 'ch' in  
            // char_freq[]  
            char_freq[ch - 97]++; 
        } 
  
        // no such String can be formed  
        if (Math.abs(nv - nc) >= 2) 
        { 
            return "no such String"; 
        } 
  
        // form the vowel String 'vstr' and  
        // consonant String 'cstr' which contains  
        // characters in lexicographical order  
        for (int i = 0; i < SIZE; i++) { 
            char ch = (char) (i + 97); 
            for (int j = 1; j <= char_freq[i]; j++)  
            { 
                if (isVowel(ch))  
                { 
                    vstr += ch; 
                }  
                else
                { 
                    cstr += ch; 
                } 
            } 
        } 
  
        // remove first character of vowel String  
        // then create alternate String with  
        // cstr[0...nc-1] and vstr[1...nv-1]  
        if (nv > nc) { 
            return (vstr.charAt(0) + createAltStr(cstr, 
                    vstr, 1, nv)); 
        } 
  
        // remove first character of consonant String  
        // then create alternate String with  
        // vstr[0...nv-1] and cstr[1...nc-1]  
        if (nc > nv)  
        { 
            return (cstr.charAt(0) + createAltStr(vstr, 
                    cstr, 1, nc)); 
        } 
  
        // if both vowel and consonant  
        // strings are of equal length  
        // start creating String with consonant  
        if (cstr.charAt(0) < vstr.charAt(0))  
        { 
            return createAltStr(cstr, vstr, 0, nv); 
        } 
  
        // start creating String with vowel  
        return createAltStr(vstr, cstr, 0, nc); 
    } 
  
    // Driver code  
    public static void main(String[] args) { 
        String str = "aeroplane"; 
        System.out.println(findAltStr(str)); 
    } 
}  
  
// This code is contributed by 29AjayKumar 

