

# Python3 implementation of the approach 
  
# Function to return the minimum replacements 
def minReplace(a: list, n) -> int: 
  
    # Map to store the frequency of 
    # the numbers at the even indices 
    te = dict() 
  
    # Map to store the frequency of 
    # the numbers at the odd indices 
    to = dict() 
  
    for i in range(n): 
  
        # Checking if the index 
        # is odd or even 
        if i % 2 == 0: 
  
            # If the number is already present then, 
            # just increase the occurrence by 1 
            if a[i] not in te: 
                te[a[i]] = 1
            else: 
                te[a[i]] += 1
        else: 
  
            # If the number is already present then, 
            # just increase the occurrence by 1 
            if a[i] not in to: 
                to[a[i]] = 1
            else: 
                to[a[i]] += 1
  
    # To store the character with 
    # maximum frequency in even indices. 
    me = -1
  
    # To store the character with 
    # maximum frequency in odd indices. 
    mo = -1
  
    # To store the frequency of the 
    # maximum occurring number in even indices. 
    ce = -1
  
    # To store the frequency of the 
    # maximum occurring number in odd indices. 
    co = -1
  
    # Iterating over Map of even indices to 
    # get the maximum occurring number. 
    for it in te: 
        if te[it] > ce: 
            ce = te[it] 
            me = it 
  
    # Iterating over Map of odd indices to 
    # get the maximum occurring number. 
    for it in to: 
        if to[it] > co: 
            co = to[it] 
            mo = it 
  
    # To store the final answer 
    res = 0
  
    for i in range(n): 
        if i % 2 == 0: 
  
            # If the index is even but 
            # a[i] != me 
            # then a[i] needs to be replaced 
            if a[i] != me: 
                res += 1
        else: 
  
            # If the index is odd but 
            # a[i] != mo 
            # then a[i] needs to be replaced 
            if a[i] != mo: 
                res += 1
  
    return res 
  
# Driver Code 
if __name__ == "__main__": 
    n = 4
    a = [3, 1, 3, 2] 
    print(minReplace(a, n)) 
  
# This code is contributed by 
# sanjeev2552 

