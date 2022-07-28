

# Python3 implementation of the approach 
  
# Function that counts the 
# minimum segments required 
def CountSegments(N, a): 
      
    # all values are '0' initially 
    frequency = [0] * 10001
  
    # count of segments 
    c = 0
  
    # store frequency of every element 
    for i in range(N) : 
        frequency[a[i]] += 1
  
    # find maximum frequency 
    for i in range(10001): 
        c = max(c, frequency[i]) 
  
    print(c) 
  
# Driver code 
if __name__ == "__main__": 
    N = 6
    a = [ 1, 3, 4, 3, 2, 3 ]  
    CountSegments(N, a) 
  
# This code is contributed  
# by ChitraNayal 

