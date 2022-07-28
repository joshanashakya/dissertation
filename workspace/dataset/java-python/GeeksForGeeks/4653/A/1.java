

// Java program to find lexicographically 
// next word which contains first K  
// letters of the English alphabet  
// and does not contain a palindrome  
// as it's substring of length more 
// than one. 
  
public class GFG  
{ 
  
    // function to return lexicographically 
    // next word  
    static void findNextWord(char[] s, int m)  
    { 
        // we made m as m+97 that means  
        // our required string contains 
        // not more than m+97(as per ASCII  
        // value) in it. 
        m += 97; 
        int n = s.length; 
        int i = s.length - 1; 
  
        // increment last alphabet to make 
        // next lexicographically next word. 
        s[i]++; 
  
        while (i >= 0 && i <= n - 1)  
        { 
  
            // if i-th alphabet not in first 
            // k letters then make it as "a" 
            // and then increase (i-1)th letter 
            if (s[i] >= m) 
            { 
                s[i] = 'a'; 
                s[--i]++; 
            }  
            // to check whether formed string  
            // palindrome or not. 
            else if (s[i] == s[i - 1] 
                    || s[i] == s[i - 2])  
            { 
                s[i]++; 
            }  
            // increment i. 
            else
            { 
                i++; 
            } 
        } 
  
        // if i less than or equals to one 
        // that means we not formed such word. 
        if (i <= -1) 
        { 
            System.out.println("-1"); 
        } 
        else
        { 
            System.out.println(s); 
        } 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        char[] str = "abcd".toCharArray(); 
        int k = 4; 
        findNextWord(str, k); 
    } 
} 
  
// This code contributed by Rajput-Ji 

