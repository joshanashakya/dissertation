

# Python3 program to find 
# the mising Number 
# getMissingNo takes list as argument  
  
def getMissingNo(a, n): 
    x1 = a[0] 
    x2 = 1
      
    for i in range(1, n): 
        x1 = x1 ^ a[i] 
          
    for i in range(2, n + 2): 
        x2 = x2 ^ i 
      
    return x1 ^ x2 
  
  
# Driver program to test above function 
if __name__=='__main__': 
  
    a = [1, 2, 4, 5, 6] 
    n = len(a) 
    miss = getMissingNo(a, n)  
    print(miss) 
      
# This code is contributed by Yatin Gupta  

