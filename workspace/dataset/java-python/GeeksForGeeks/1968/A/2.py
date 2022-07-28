

# Python3 program to Count unordered pairs  
# (i, j) in array such that product of a[i]  
# and a[j] can be expressed as power of two  
  
# Function to check if x is power of 2 
def isPowerOfTwo(x) : 
  
    # First x in the below expression  
    # is for the case when x is 0  
    return (x and(not(x & (x - 1)))) 
  
# Function to Count unordered pairs  
def Count_pairs(a, n) : 
  
    count = 0
  
    for i in range(n) : 
  
        # is a number can be expressed  
        # as power of two  
        if isPowerOfTwo(a[i]) : 
            count += 1
  
    # count total number  
    # of unordered pairs 
    ans = (count * (count - 1)) / 2
  
    print(ans) 
  
# Driver code      
if __name__ == "__main__" : 
  
    a = [ 2, 5, 8, 16, 128] 
  
    n = len(a) 
  
    Count_pairs(a, n) 
                  
# This code is contributed by ANKITRAI1 

