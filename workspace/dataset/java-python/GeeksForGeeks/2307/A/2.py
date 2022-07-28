

# Python program to find if it is possible 
# to make a number divisible by 3 using 
# all digits of given array 
  
def isPossibleToMakeDivisible(arr, n): 
    # Find remainder of sum when divided by 3 
    remainder = 0
    for i in range (0, n): 
        remainder = (remainder + arr[i]) % 3
  
    # Return true if remainder is 0. 
    return (remainder == 0) 
  
# main() 
  
arr = [40, 50, 90 ]; 
n = 3
if (isPossibleToMakeDivisible(arr, n)): 
    print("Yes") 
else: 
    print("No") 
  
# Code Contributed by Mohit Gupta_OMG <(0_o)> 

