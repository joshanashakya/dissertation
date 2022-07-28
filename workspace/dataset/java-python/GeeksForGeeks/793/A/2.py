

# Python3 program to count m digit 
# numbers having n as divisor. 
  
# Returns count of m digit  
# numbers having n as divisor 
def findCount(m, n): 
  
    # Generating largest number of m digit 
    num1 = 0
      
    for i in range(0, m): 
        num1 = (num1 * 10) + 9
  
    # Generating largest number of m-1 digit 
    num2 = 0
      
    for i in range(0, (m - 1)): 
        num2 = (num2 * 10) + 9
  
    # returning number of dividend 
    return int((num1 / n) - (num2 / n))  
  
  
# Driver code 
m = 2; n = 6
print(findCount(m, n))  
  
# This code is contributed by Smitha Dinesh Semwal 

