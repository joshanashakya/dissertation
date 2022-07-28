

# Python3 program to count divisors 
# of n that have at least 
# one digit common with n 
import math 
  
# Function to return true if any   
# digit of m is present in hash[]. 
def isDigitPresent(m, Hash): 
  
    # check till last digit 
    while (m):  
  
        # if number is also present in original   
        # number then return true 
        if (Hash[m % 10]): 
            return True
        m = m // 10
  
    # if no number matches then return 1 
    return False
  
# Count the no of divisors that  
# have at least 1 digits same 
def countDivisibles(n): 
  
    # Store digits present in n in a hash[] 
    Hash = [False for i in range(10)] 
    m = n 
    while (m):  
  
        # marks that the number is present 
        Hash[m % 10] = True
  
        # last digit removed  
        m = m // 10
      
  
    # loop to traverse from 1 to sqrt(n) to  
    # count divisors 
    ans = 0
    for i in range(1, int(math.sqrt(n)) + 1):  
  
        # if i is the factor 
        if (n % i == 0):  
  
            # call the function to check if any 
            # digits match or not 
            if (isDigitPresent(i, Hash)): 
                ans += 1
  
            if (n // i != i):  
  
                # if n/i != i then a different number,  
                # then check it also 
                if (isDigitPresent(n // i, Hash)): 
                    ans += 1
  
    # return the answer 
    return ans 
  
# Driver Code 
n = 15
print(countDivisibles(n)) 
  
# This code is contributed by Anant Agarwal. 

