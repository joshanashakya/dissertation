

// Java program to rearrange the 
// string such to maximize the 
// number of palindromic substrings 
  
  
public class GFG { 
      
    // Function to return the newString 
    static String newString(String s) 
    { 
        // length of string 
        int l = s.length(); 
  
        // hashing array 
        int freq[] = new int [26] ; 
  
        // iterate and count 
        for (int i = 0; i < l; i++) { 
            freq[s.charAt(i) - 'a'] += 1; 
        } 
  
        // resulting string 
        String ans = ""; 
  
        // form the resulting string 
        for (int i = 0; i < 26; i++) { 
  
            // number of times character appears 
            for (int j = 0; j < freq[i]; j++) { 
  
                // append to resulting string 
                ans += (char)(97 + i); 
            } 
        } 
  
        return ans; 
    } 
  
  
    // Driver code 
    public static void main(String args[]) 
    { 
           String s = "aabab"; 
            System.out.println(newString(s)); 
    } 
    // This Code is contributed by ANKITRAI1 
} 

