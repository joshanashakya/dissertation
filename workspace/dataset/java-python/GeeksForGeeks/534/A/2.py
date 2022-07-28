

# Python3 implementation of above approach 
  
# Returns the count of odd and  
# even subsequences  
def countSum(arr, n): 
    result = 0
      
    # Variables to store the count of even  
    # subsequences and odd subsequences  
    # Initialising count_even and count_odd to 0  
    # since as there is no subsequence before the  
    # iteration with even or odd count.  
    count_odd = 0
    count_even = 0
  
    # Find sum of all subsequences with even count  
    # and odd count and storing them as we iterate.  
  
    for i in range(1, n + 1): 
          
        # if the number is even  
        if (arr[i - 1] % 2 == 0): 
            count_even = count_even + count_even + 1
            count_odd = count_odd + count_odd 
  
        # if the number is odd  
        else: 
            temp = count_even 
            count_even = count_even + count_odd 
            count_odd = count_odd + temp + 1
  
    return (count_even, count_odd)  
      
# Driver code  
arr = [1, 2, 2, 3];  
n = len(arr) 
  
# Calling the function  
count_even, count_odd = countSum(arr, n);  
  
print("EvenSum = ", count_even,  
      " OddSum = ", count_odd) 
        
# This code is contributed  
# by ANKITKUMAR34 

