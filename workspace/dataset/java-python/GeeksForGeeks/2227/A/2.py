

# Python 3 implemenattion of the above approach 
  
# Function to find the maximum product and sum 
def maxProductSum(str, m): 
  
    n = len(str) 
    product = 1
    sum = 0
  
    # find the sum and product of first K digits 
    for i in range(m): 
        sum += (ord(str[i]) - ord('0')) 
        product *= (ord(str[i]) - ord('0')) 
  
    # Update maxProd and maxSum 
    maxProd = product 
    maxSum = sum
  
    # Start traversing the next element 
    for i in range(m, n) : 
  
        # Multiply with the current digit and divide  
        # by the first digit of previous window 
        product = (product * (ord(str[i]) - ord('0')) // 
                            ((ord(str[i - m])) - ord('0'))) 
  
        # Add the current digit and subtract 
        # the first digit of previous window 
        sum = (sum + (ord(str[i]) - ord('0')) - 
                    ((ord(str[i - m])) - ord('0'))) 
  
        # Update maxProd and maxSum 
        maxProd = max(maxProd, product) 
        maxSum = max(maxSum, sum) 
  
    print("Maximum Product =", maxProd) 
    print("Maximum Sum =", maxSum) 
  
# Driver code 
if __name__ == "__main__": 
      
    str = "3675356291"
    m = 5
  
    maxProductSum(str, m) 
  
# This code is contributed by ita_c 

