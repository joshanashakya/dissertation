

# Python 3 program to check if  
# a string is substring of other. 
  
# Returns true if s1 is substring of s2 
def isSubstring(s1, s2): 
    M = len(s1) 
    N = len(s2) 
  
    # A loop to slide pat[] one by one  
    for i in range(N - M + 1): 
  
        # For current index i, 
        # check for pattern match  
        for j in range(M): 
            if (s2[i + j] != s1[j]): 
                break
              
        if j + 1 == M : 
            return i 
  
    return -1
  
# Driver Code 
if __name__ == "__main__": 
    s1 = "for"
    s2 = "geeksforgeeks"
    res = isSubstring(s1, s2) 
    if res == -1 : 
        print("Not present") 
    else: 
        print("Present at index " + str(res)) 
  
# This code is contributed by ChitraNayal 

