

# Python3 implementation to  
# check whether product of 'n'  
# numbers is even or odd 
  
# function to check whether  
# product of 'n' numbers is  
# even or odd 
def isProductEven(arr, n): 
  
    for i in range(0, n): 
  
        # if a single even number is  
        # found, then final product  
        # will be an even number 
        if ((arr[i] & 1) == 0): 
            return True
  
    # product is an odd number 
    return False
  
# Driver Code 
arr = [ 2, 4, 3, 5 ] 
n = len(arr) 
if (isProductEven(arr, n)): 
    print("Even")  
else: 
    print("Odd")  
  
# This code is contributed  
# by ihritik 

