

# Python 3 program to find nth number that  
# contains the digit k or divisible by k. 
  
# Function for checking if  
# digit k is in n or not 
def checkdigit(n, k): 
  
    while (n): 
      
        # finding remainder 
        rem = n % 10
  
        # if digit found 
        if (rem == k): 
            return 1
  
        n = n / 10
      
    return 0
  
# Function for finding nth number 
def findNthNumber(n, k): 
      
    i = k + 1
    count = 1
    while(count < n): 
          
        # checking that the number contain 
        # k digit or divisible by k 
        if (checkdigit(i, k) or (i % k == 0)): 
            count += 1
          
        if (count == n): 
            return i 
        i += 1
    return -1
  
# Driver code 
n = 10
k = 2
print(findNthNumber(n, k)) 
  
# This code is contributed 
# by Smitha Dinesh Semwal 

