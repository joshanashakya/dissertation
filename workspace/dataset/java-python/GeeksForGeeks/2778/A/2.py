

# Python3 program to find maximum length  
# equal character string with k changes 
  
# function to find the maximum length of 
# substring having character ch 
def findLen(A, n, k, ch): 
    maxlen = 1
    cnt = 0
    l = 0
    r = 0
  
    # traverse the whole string 
    while r < n: 
  
        # if character is not same as ch 
        # increase count 
        if A[r] != ch: 
            cnt += 1
  
        # While count > k traverse the string 
        # again until count becomes less than k 
        # and decrease the count when characters 
        # are not same 
        while cnt > k: 
            if A[l] != ch: 
                cnt -= 1
            l += 1
  
        # length of substring will be rightIndex - 
        # leftIndex + 1. Compare this with the  
        # maximum length and return maximum length 
        maxlen = max(maxlen, r - l + 1) 
        r += 1
  
    return maxlen 
  
# function which returns 
# maximum length of substring 
def answer(A, n, k): 
    maxlen = 1
    for i in range(26): 
        maxlen = max(maxlen, findLen(A, n, k,  
                             chr(i + ord('A')))) 
        maxlen = max(maxlen, findLen(A, n, k,  
                             chr(i + ord('a')))) 
  
    return maxlen 
  
# Driver Code 
if __name__ == "__main__": 
    n = 5
    k = 2
    A = "ABABA"
    print("Maximum length =", 
             answer(A, n, k)) 
  
    n = 6
    k = 4
    B = "HHHHHH"
    print("Maximum length =",  
             answer(B, n, k)) 
  
# This code is contributed by 
# sanjeev2552 

