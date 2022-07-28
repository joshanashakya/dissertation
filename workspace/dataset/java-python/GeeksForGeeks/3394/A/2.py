

# Python3 code for minimum insertions 
# to make a Co-prime Array. 
from fractions import gcd 
  
def printResult(arr, n): 
  
    # Counting adjacent pairs that  
    # are not co-prime. 
    count = 0
    for i in range(1,n): 
        if (gcd(arr[i], arr[i - 1]) != 1): 
            count+=1
      
    print(count)     # No.of insertions 
    print( arr[0], end = " ") 
    for i in range(1,n): 
          
        # If pair is not a co-prime insert 1. 
        if (gcd(arr[i], arr[i - 1]) != 1): 
            print(1, end = " ") 
        print(arr[i] , end = " ") 
          
# Driver Code 
A = [ 5, 10, 20 ] 
n = len(A) 
printResult(A, n)  
  
# This code is contributed by "Sharad_Bhardwaj". 

