

# Python 3 implementation of the approach 
N = 2
  
# Function that returns true 
# if ch is a vowel 
def isVowel(ch): 
    return (ch == 'a' or ch == 'e' or 
            ch == 'i' or ch == 'o' or
            ch == 'u') 
  
def performQueries(str1, len1, queries, q): 
      
    # pre[i] will store the count of 
    # vowels in the substring str[0...i] 
    pre = [0 for i in range(len1)] 
  
    if (isVowel(str1[0])): 
        pre[0] = 1
    else: 
        pre[0] = 0
  
    # Fill the pre[] array 
    for i in range(0, len1, 1): 
          
        # If current character is a vowel 
        if (isVowel(str1[i])): 
            pre[i] = 1 + pre[i - 1] 
  
        # If its a consonant 
        else: 
            pre[i] = pre[i - 1] 
  
    # For every query 
    for i in range(q): 
          
        # Find the count of vowels 
        # for the current query 
        if (queries[i][0] == 0): 
            print(pre[queries[i][1]]) 
        else: 
            print(pre[queries[i][1]] - 
                  pre[queries[i][0] - 1]) 
  
# Driver code 
if __name__ == '__main__': 
    str1 = "geeksforgeeks"
    len1 = len(str1) 
    queries = [[1, 3], [2, 4], [1, 9]] 
    q = len(queries) 
  
    performQueries(str1, len1, queries, q) 
  
# This code is contributed by Surendra_Gangwar 

