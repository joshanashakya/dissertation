

# Python3 implementation of above approach  
  
# To store the values of subproblems  
dp = {};  
  
# Function to find the  
# Longest Palindromic subsequence of even  
# length with no two adjacent characters same  
def solve(s, c) :  
      
    # Base cases  
    # If the string length is 1 return 0  
    if (len(s) == 1) : 
        return 0;  
  
    # If the string length is 2  
    if (len(s) == 2) : 
  
        # Check if the characters match  
        if (s[0] == s[1] and s[0] == c) : 
            return 1;  
        else : 
            return 0;  
      
    # If the value with given parameters is  
    # previously calculated  
    if (s + " " + c) in dp :  
        return dp[s + " " + c];  
  
    ans = 0;  
  
    # If the first and last character of the  
    # string matches with the given character  
    if (s[0] == s[len(s) - 1] and s[0] == c) : 
  
        # Remove the first and last character  
        # and call the function for all characters  
        for c1 in range(97,123) : 
  
            if (chr(c1) != c) : 
                ans = max( ans, 1 + solve( 
                        s[1 : len(s) - 1], chr(c1)));  
      
  
    # If it does not match  
    else : 
          
        # Then find the first and last index of  
        # given character in the given string  
        for i in range(len(s)) :  
  
            if (s[i] == c) : 
                for j in range(len(s) - 1, i, -1) : 
                    if (s[j] == c) : 
                        if (j == i) : 
                            break;  
  
                        # Take the substring from i  
                        # to j and call the function  
                        # with substring  
                        # and the given character  
                        ans = solve( s[i : j - i + 2], c);  
                        break;  
  
                break;  
          
    # Store the answer for future use  
    dp[s + " " + c] = ans; 
      
    return dp[s + " " + c];  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "abscrcdba";  
  
    ma = 0;  
  
    # Check for all starting characters  
    for c1 in range(97,123) : 
        ma = max(ma, solve(s, chr(c1)) * 2);  
      
    print(ma);  
      
# This code is contributed by AnkitRai01 

