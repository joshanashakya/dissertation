

# Python program to find 
# maximum sum of odd  
# subsequence if it exists.  
  
# Returns maximum sum odd 
# subsequence if exists 
# Else returns -1 
def findMaxOddSubarraySum(arr, n): 
  
    # Here min_odd is the 
    # minimum odd number (in 
    # absolute terms). 
    # Initializing with max value 
    # of int . 
    min_odd = +2147483647
   
    # To check if there is 
    # at-least one odd number. 
    isOdd = False
      
    # To store sum of 
    # all positive elements 
    sum = 0  
    for i in range(n): 
      
        # Adding positive number 
        # would increase 
        # the sum. 
        if (arr[i] > 0): 
            sum = sum + arr[i] 
   
        # To find the minimum 
        # odd number(absolute) 
        # in the array. 
        if (arr[i]%2 != 0): 
          
            isOdd = True
            if (min_odd > abs(arr[i])): 
                min_odd = abs(arr[i]) 
   
    # If there was no odd number 
    if (isOdd == False): 
         return -1
   
    # Now, sum will be 
    # either odd or even. 
    # If even, changing it to 
    # odd. As, even - odd = odd. 
    # since m is the minimum 
    # odd number(absolute). 
    if (sum%2 == 0): 
        sum = sum - m 
   
    return sum
  
   
# Driver code 
  
arr = [2, -3, 5, -1, 4] 
n =len(arr) 
  
print(findMaxOddSubarraySum(arr, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

