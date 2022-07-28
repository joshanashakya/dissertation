

# Space efficient Python3 program to count all 
# substrings with same first and last characters. 
def countSubstringWithEqualEnds(s): 
  
    result = 0; 
    n = len(s); 
  
    # Iterating through all substrings in 
    # way so that we can find first and  
    # last character easily 
    for i in range(n): 
        for j in range(i, n): 
            if (s[i] == s[j]): 
                result = result + 1
  
    return result 
  
# Driver Code 
s = "abcab"; 
print(countSubstringWithEqualEnds(s)) 
  
# This code is contributed  
# by Akanksha Rai 

