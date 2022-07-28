

// Java program to count number of substrings  
// in which each character has count less  
// than or equal to k. 
class GFG  
{ 
      
    //function to find number of substring  
    //in which each character has count less  
    // than or equal to k.  
    static int find_sub(String s, int k)  
    { 
        int len = s.length(); 
  
        // initialize left and right pointer to 0  
        int lp = 0, rp = 0; 
        int ans = 0; 
  
        // an array to keep track of count of each alphabet  
        int[] hash_char = new int[26]; 
        for (; rp < len; rp++)  
        { 
            hash_char[s.charAt(rp) - 'a']++; 
            while (hash_char[s.charAt(rp) - 'a'] > k)  
            { 
                // decrement the count  
                hash_char[s.charAt(lp) - 'a']--; 
  
                //increment left pointer  
                lp++; 
            } 
            ans += rp - lp + 1; 
        } 
        return ans; 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
        String S = "aaabb"; 
        int k = 2; 
        System.out.println(find_sub(S, k)); 
    } 
}  
  
// This code is contributed by PrinciRaj1992 

