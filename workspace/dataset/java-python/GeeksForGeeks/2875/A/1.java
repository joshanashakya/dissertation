

// Java implementation to find 
// the length of the longest  
// substring having frequency 
// of each character less  
// than equal to k 
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
      
    public final static int SIZE = 26; 
      
    // function to find the length 
    // of the longest substring  
    // having frequency of each  
    // character less than equal  
    // to k 
    public static int longSubstring(String str1,  
                                           int k) 
    { 
        // hash table to store frequency 
        // of each table 
        int[] freq = new int [SIZE]; 
  
        char[] str = str1.toCharArray(); 
  
        // 'start' index of the current 
        // substring 
        int start = 0; 
  
        // to store the maximum length 
        int maxLen = 0; 
        char ch; 
  
        int n = str1.length(); 
  
        // traverse the string 'str' 
        for (int i = 0; i < n; i++) 
        { 
            // get the current character 
            // as 'ch' 
            ch = str[i]; 
  
            // increase frequency of  
            // 'ch' in 'freq[]' 
            freq[ch - 'a']++; 
  
            // if frequency of 'ch'  
            // becomes more than 'k' 
            if (freq[ch - 'a'] > k)  
            { 
                // update 'maxLen' 
                if (maxLen < (i - start)) 
                    maxLen = i - start; 
  
                // decrease frequency of  
                // each character as they  
                // are encountered from  
                // the 'start' index until  
                // frequency of 'ch' is  
                // greater than 'k' 
                while (freq[ch - 'a'] > k)  
                { 
  
                    // decrement frequency 
                    // by '1' 
                    freq[str[start] - 'a']--; 
  
                    // increment 'start' 
                    start++; 
                } 
            } 
        } 
  
        // update maxLen 
        if (maxLen < (n - start)) 
            maxLen = n - start; 
  
        // required length 
        return maxLen; 
    } 
      
    // Driver function  
    public static void main(String argc[]) 
    { 
        String str = "babcaag"; 
        int k = 1; 
          
        System.out.println("Length = " + 
        longSubstring(str, k)); 
    } 
} 
  
/* This code is contributed by Sagar Shukla */

