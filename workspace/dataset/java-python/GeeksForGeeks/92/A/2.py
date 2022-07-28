

# Python  program to find 
# if array elements can 
# be made same 
  
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
  
# To calculate LCM of whole array 
def lcmOfArray(arr,n): 
      
    ans = arr[0] 
    for i in range(1,n): 
        ans = (arr[i]*ans)/___gcd(arr[i], ans) 
    return ans 
  
   
# function to check possibility 
# if we can make 
# all element same or not 
def checkArray(arr, prime, n, m): 
  
    # Find LCM of whole array 
    lcm = lcmOfArray(arr, n) 
   
    # One by one check if 
    # value of lcm / arr[i] 
    # can be formed using prime numbers. 
    for i in range(n): 
  
        # divide each element 
        # of array by LCM 
        val = lcm/arr[i] 
   
        # Use each input prime 
        # number to divide 
        # the result to remove 
        # all factors of 
        # input prime numbers 
        for j in range(m and val!=1): 
            while (val % prime[j] == 0): 
                val = val/prime[j] 
   
        # If the remaining value 
        # is not 1, then 
        # it is not possible to 
        # make all elements 
        # same. 
        if (val != 1): 
            return 0
   
    return 1
  
# Driver code 
arr = [50, 200] 
prime = [2, 3] 
n = len(arr) 
m = len(prime) 
   
if(checkArray(arr, prime, n, m)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed 
# by Anant Agarwal. 

