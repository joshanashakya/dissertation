

# Python3 implementation of the approach 
  
# Function to return the minimum number of 
# pre-processing moves required on string A 
def Preprocess(A, B): 
  
    # Length of the given strings 
    n = len(A) 
  
    # To store the required answer 
    ans = 0
  
    # Run a loop upto n/2 
    for i in range(n // 2): 
  
        # To store frequency of 4 characters 
        mp = dict() 
          
        mp[A[i]] = 1
        if A[i] == A[n - i - 1]: 
            mp[A[n - i - 1]] += 1
  
        if B[i] in mp.keys(): 
            mp[B[i]] += 1
        else: 
            mp[B[i]] = 1
          
        if B[n - i - 1] in mp.keys(): 
            mp[B[n - 1 - i]] += 1
        else: 
            mp[B[n - 1 - i]] = 1
  
        sz = len(mp) 
  
        # If size is 4 
        if (sz == 4): 
            ans += 2
          
        # If size is 3     
        elif (sz == 3): 
            ans += 1 + (A[i] == A[n - i - 1]) 
          
        # If size is 2 
        elif (sz == 2): 
            ans += mp[A[i]] != 2
      
    # If n is odd 
    if (n % 2 == 1 and A[n // 2] != B[n // 2]): 
        ans += 1
  
    return ans 
  
# Driver code 
A = "abacaba"
B = "bacabaa"
print(Preprocess(A, B)) 
  
# This code is contributed by Mohit Kumar 

