

import java.util.Arrays; 
  
// Java program to count number of substrings  
// in which each character has count less  
// than or equal to k. 
class GFG { 
  
    static int findSubstrings(String s, int k) { 
        // variable to store count of substrings.  
        int ans = 0; 
  
        // array to store count of each character.  
        int cnt[] = new int[26]; 
  
        int i, j, n = s.length(); 
        for (i = 0; i < n; i++) { 
  
            // Initialize all characters count to zero.  
            Arrays.fill(cnt, 0); 
  
            for (j = i; j < n; j++) { 
                // increment character count  
                cnt[s.charAt(j) - 'a']++; 
  
                // check only the count of current character  
                // because only the count of this  
                // character is changed. The ending point is  
                // incremented to current position only if  
                // all other characters have count at most  
                // k and hence their count is not checked.  
                // If count is less than k, then increase ans  
                // by 1.  
                if (cnt[s.charAt(j) - 'a'] <= k) { 
                    ans++; 
                } // if count is less than k, then break as  
                // subsequent substrings for this starting  
                // point will also have count greater than  
                // k and hence are reduntant to check.  
                else { 
                    break; 
                } 
            } 
        } 
  
        // return the final count of substrings.  
        return ans; 
    } 
  
// Driver code  
    static public void main(String[] args) { 
        String S = "aaabb"; 
        int k = 2; 
        System.out.println(findSubstrings(S, k)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

