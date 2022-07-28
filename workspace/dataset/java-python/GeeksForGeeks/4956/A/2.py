

# Python3 program to Count number of ways we 
# can get palindrome string from a given 
# string 
  
# function to find the substring of the 
# string 
def substring(s, a, b): 
    s1 = "" 
  
    # extract the specified poition of 
    # the string 
    for i in range(a, b, 1): 
        s1 += s[i] 
  
    return s1 
  
# can get palindrome string from a 
# given string 
def allPalindromeSubstring(s): 
    v = [] 
  
    # moving the pivot from starting till 
    # end of the string 
    pivot = 0.0
    while pivot < len(s): 
  
        # set radius to the first nearest 
        # element on left and right 
        palindromeRadius = pivot - int(pivot) 
  
        # if the position needs to be 
        # compared has an element and the 
        # characters at left and right 
        # matches 
        while ((pivot + palindromeRadius) < len(s) and 
                   (pivot - palindromeRadius) >= 0 and 
                  (s[int(pivot - palindromeRadius)] == 
                   s[int(pivot + palindromeRadius)])): 
             v.append(s[int(pivot - palindromeRadius): 
                        int(pivot + palindromeRadius + 1)]) 
  
             # increasing the radius by 1 to point 
             # to the next elements in left and right 
             palindromeRadius += 1
  
        pivot += 0.5
    return v 
  
# Driver Code 
if __name__ == "__main__": 
    v = allPalindromeSubstring("hellolle") 
    print(len(v)) 
    print(v) 
  
    v = allPalindromeSubstring("geeksforgeeks") 
    print(len(v)) 
    print(v) 
  
# This code is contributed by 
# sanjeev2552 

