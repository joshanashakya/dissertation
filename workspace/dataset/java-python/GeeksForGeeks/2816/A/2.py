

# Python 3 implementation of the approach 
  
# Function to return the minimum operations 
# of the given type required to convert 
# string s to string t 
def minOperations(s, t, n): 
  
    ct0 = 0
    ct1 = 0
    for i in range(n): 
  
        # Characters are already equal 
        if (s[i] == t[i]): 
            continue
  
        # Increment count of 0s 
        if (s[i] == '0'): 
            ct0 += 1
  
        # Increment count of 1s 
        else: 
            ct1 += 1
  
    return max(ct0, ct1) 
  
# Driver code 
if __name__ == "__main__": 
      
    s = "010"
    t = "101"
    n = len(s) 
    print(minOperations(s, t, n)) 
  
# This code is contributed by ita_c 

