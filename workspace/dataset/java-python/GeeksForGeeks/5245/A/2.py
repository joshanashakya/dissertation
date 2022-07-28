

# Python3 program to find the maximum number  
# of elements that can be added to a set  
# such that it is the absolute difference  
# of 2 elements already in the set  
  
# from math lib import gcd method 
from math import gcd 
  
  
# Function to find the maximum number  
# of elements that can be added to a set  
# such that it is the absolute difference  
# of 2 elements already in the set  
def maxNewElements(a, n) : 
  
    __gcd = a[0] 
  
    mx = a[0] 
  
    for i in range(1, n) : 
        __gcd = gcd(__gcd,a[i]) 
        mx = max(mx, a[i]) 
  
    total_terms = mx / __gcd 
  
    return total_terms - n 
  
  
  
  
# Driver code 
if __name__ == "__main__" : 
  
    a = [ 4, 6, 10 ] 
  
    n = len(a) 
  
    print(int(maxNewElements(a,n))) 
  
# This code is contributed by  
# ANKITRAI1 

