

# Python program, to find 
# length of the largest 
# subarray with GCD equals to 1. 
  
def ___gcd(a,b): 
  
    # Everything divides 0  
    if (a == 0 or b == 0): 
        return 0
   
    # base case 
    if (a == b): 
        return a 
   
    # a is greater 
    if (a > b): 
        return ___gcd(a-b, b) 
    return ___gcd(a, b-a) 
      
def findLargest(arr, n):  
  
    '''If gcd of any subarray is 1 then gcd of 
     any number with the sub array will be 1. 
     so if we are getting any subarray with 
     gcd 1, then maximum number of element of 
      the subarray will be equal to the number 
      of elements of the array. Else it will be -1.'''
    gcd = arr[0] 
    for i in range(1,n): 
        gcd = ___gcd(gcd, arr[i]) 
   
    return n if (gcd == 1) else -1
      
# Driver code 
arr=[1, 3, 5, 7] 
n=len(arr) 
  
print("Length of the largest subarray = ", 
         findLargest(arr, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

