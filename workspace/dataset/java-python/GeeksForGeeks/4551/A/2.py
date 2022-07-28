

# Python3 code to find number of  
# subsequences of "ab" in the  
# string S which is repeated K times. 
  
def countOccurrences (s, K): 
    n = len(s) 
    c1 = 0
    c2 = 0
    C = 0
    for i in range(n): 
        if s[i] == 'a': 
            c1+= 1 # Count of 'a's 
        if s[i] == 'b': 
            c2+= 1 # Count of 'b's 
              
            # occurrence of "ab"s in string S 
            C += c1  
              
    # Add following two : 
    # 1) K * (Occurrences of "ab" in single string) 
    # 2) a is from one string and b is from other. 
    return C * K + (K * (K - 1) / 2) * c1 * c2 
      
      
# Driver code 
S = "abcb"
k = 2
print (countOccurrences(S, k)) 
  
# This code is contributed by "Abhishek Sharma 44" 

