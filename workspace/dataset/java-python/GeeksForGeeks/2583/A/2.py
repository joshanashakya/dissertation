

# Python3 program to find the n-th number  
# with the sum of digits as 10.  
import math 
  
def findNth(n):  
  
    nthElement = 19 + (n - 1) * 9
    outliersCount = int(math.log10(nthElement)) - 1
  
    # find the nth perfect number  
    nthElement += 9 * outliersCount  
    return nthElement  
  
# Driver Code  
if __name__ == "__main__":  
  
    print(findNth(5))  
  
# This code is contributed by Rituraj Jain 

