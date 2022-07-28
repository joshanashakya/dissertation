

// Java implementation of the approach 
import java.util.Arrays; 
  
class GFG  
{ 
  
    static int MAX = 26; 
  
    // Function to return the count of 
    // required pairs of characters 
    static int countPairs(char[] str, int k)  
    { 
  
        // Length of the string 
        int n = str.length; 
  
        // To store the frequency 
        // of each character 
        int[] freq = new int[MAX]; 
  
        // Update the frequency 
        // of each character 
        for (int i = 0; i < n; i++)  
        { 
            freq[str[i] - 'a']++; 
        } 
  
        // To store the required 
        // count of pairs 
        int cnt = 0; 
  
        // If ascii value difference is zero 
        if (k == 0) 
        { 
  
            // If there exists similar characters 
            // more than once 
            for (int i = 0; i < MAX; i++) 
            { 
                if (freq[i] > 1)  
                { 
                    cnt += ((freq[i] * (freq[i] - 1)) / 2); 
                } 
            } 
        }  
        else
        { 
  
            // If there exits characters with 
            // ASCII value difference as k 
            for (int i = 0; i < MAX; i++) 
            { 
                if (freq[i] > 0 && i + k < MAX && freq[i + k] > 0) 
                { 
                    cnt += (freq[i] * freq[i + k]); 
                } 
            } 
            ; 
        } 
  
        // Return the required count 
        return cnt; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String str = "abcdab"; 
        int k = 0; 
  
        System.out.println(countPairs(str.toCharArray(), k)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

