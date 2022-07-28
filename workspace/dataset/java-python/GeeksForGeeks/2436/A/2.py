

# Simple Python 3 program to sum   
# of n digit divisible numbers. 
  
# Returns sum of n digit numbers 
# divisible by 'number' 
def totalSumDivisibleByNum(n, number): 
  
    # compute the first and last term 
    firstnum = pow(10, n - 1) 
    lastnum = pow(10, n) 
      
    # sum of number which having 
    # n digit and divisible by number 
    sum = 0
    for i in range(firstnum, lastnum): 
        if (i % number == 0): 
            sum += i 
    return sum
  
  
# Driver code 
n = 3; num = 7
print(totalSumDivisibleByNum(n, num)) 
  
# This code is contributed by Smitha Dinesh Semwal 

