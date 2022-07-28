

# Python3 program to find if it is  
# possible to make all array elements 
# 0 by decrement operations. 
def isPossibleToZero(a, n): 
  
    # used for storing the  
    # sum of even and odd  
    # position element in array. 
    even = 0;  
    odd = 0;  
      
    for i in range(n):  
          
        # if position is odd, store sum  
        # value of odd position in odd 
        if (i & 1):  
            odd += a[i]; 
          
        # if position is even, store sum  
        # value of even position in even 
        else: 
            even += a[i]; 
      
    return (odd == even); 
  
# Driver Code 
arr = [0, 1, 1, 0]; 
n = len(arr); 
if (isPossibleToZero(arr, n)): 
    print("YES"); 
else: 
    print("NO"); 
  
# This code is contributed by mits 

