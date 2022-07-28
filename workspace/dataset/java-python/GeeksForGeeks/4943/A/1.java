

// Java program to print the  
// lexicographically largest String that  
// can be formed from the characters  
// in range L and R   
  
class GFG { 
  
// Function to return the lexicographically largest String  
    static String printLargestString(String s, int l, int r) { 
        // hash array  
        int freq[] = new int[26]; 
  
        // make 0-based indexing  
        l--; 
        r--; 
  
        // iterate and count frequencies of character  
        for (int i = Math.min(l, r); i <= Math.max(l, r); i++) { 
            freq[s.charAt(i) - 'a']++; 
        } 
  
        // ans String  
        String ans = ""; 
  
        // iterate in frequency array  
        for (int i = 25; i >= 0; i--) { 
  
            // add til all characters  
            // are added  
            while (freq[i] > 0) { 
                ans += (char) ('a' + i); 
                freq[i]--; 
            } 
        } 
  
        return ans; 
    } 
  
// Driver Code  
    public static void main(String[] args) { 
  
        String s = "striver"; 
        int l = 3, r = 5; 
        System.out.println(printLargestString(s, l, r)); 
  
    } 
} 
/* This JAVA code is contributed by 29AjayKumar*/

