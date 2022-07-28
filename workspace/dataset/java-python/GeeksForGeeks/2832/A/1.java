

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
  
    // To store the values of subproblems 
    static Map<String, Integer> dp = new HashMap<>(); 
  
    // Function to find the 
    // Longest Palindromic subsequence of even 
    // length with no two adjacent characters same 
    static Integer solve(char[] s, char c)  
    { 
          
        // Base cases 
        // If the String length is 1 return 0 
        if (s.length == 1) 
            return 0; 
  
        // If the String length is 2 
        if (s.length == 2)  
        { 
  
            // Check if the characters match 
            if (s[0] == s[1] && s[0] == c) 
                return 1; 
            else
                return 0; 
        } 
  
        // If the value with given parameters is 
        // previously calculated 
        if (dp.containsKey(String.valueOf(s) + " " + c)) 
            return dp.get(String.valueOf(s) + " " + c); 
        Integer ans = 0; 
  
        // If the first and last character of the 
        // String matches with the given character 
        if (s[0] == s[s.length - 1] && s[0] == c)  
        { 
  
            // Remove the first and last character 
            // and call the function for all characters 
            for (char c1 = 'a'; c1 <= 'z'; c1++) 
  
                if (c1 != c) 
                    ans = Math.max(ans, 1 + 
                            solve(Arrays.copyOfRange(s, 
                            1, s.length - 1), c1)); 
        } 
  
        // If it does not match 
        else 
        { 
  
            // Then find the first and last index of 
            // given character in the given String 
            for (Integer i = 0; i < s.length; i++) 
            { 
  
                if (s[i] == c)  
                { 
                    for (Integer j = s.length - 1; j > i; j--) 
                        if (s[j] == c) 
                        { 
                            if (j == i) 
                                break; 
  
                            // Take the subString from i 
                            // to j and call the function 
                            // with subString 
                            // and the given character 
                            ans = solve(Arrays.copyOfRange(s, 
                                        i, j + 1), c); 
                            break; 
                        } 
  
                    break; 
                } 
            } 
        } 
  
        // Store the answer for future use 
        dp.put(String.valueOf(s) + " " + c, ans); 
        return dp.get(String.valueOf(s) + " " + c); 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String s = "abscrcdba"; 
  
        Integer ma = 0; 
  
        // Check for all starting characters 
        for (char c1 = 'a'; c1 <= 'z'; c1++) 
            ma = Math.max(ma, solve(s.toCharArray(), c1) * 2); 
        System.out.print(ma + "\n"); 
  
    } 
} 
  
// This code is contributed by 29AjayKumar 

