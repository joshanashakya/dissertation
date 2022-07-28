

# Python 3 implementation to check 
# whether given binary number is 
# evenly divisible by 2^k or not 
  
# function to check whether 
# given binary number is  
# evenly divisible by 2^k or not 
def isDivisible(str, k): 
    n = len(str) 
    c = 0
      
    # count of number of 0 from last 
    for i in range(0, k): 
        if (str[n - i - 1] == '0'):      
            c += 1
      
    # if count = k, number is evenly  
    # divisible, so returns true else  
    # false 
    return (c == k) 
  
# Driver program to test above 
# first example 
str1 = "10101100"
k = 2
if (isDivisible(str1, k)): 
    print("Yes") 
else: 
    print("No") 
  
# Second example 
str2 = "111010100"
k = 2
if (isDivisible(str2, k)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Smitha 

