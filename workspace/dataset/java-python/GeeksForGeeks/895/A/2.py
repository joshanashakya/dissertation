

# Python3 implementation of the approach 
  
# Function to return the count of  
# the divisors of a number 
def countDivisors(n): 
      
    # Count the number of 2s that divide n 
    x, ans = 0, 1
    while (n % 2 == 0): 
        x += 1
        n = n / 2
    ans = ans * (x + 1) 
  
    # n must be odd at this point. 
    # So we can skip one element 
    for i in range(3, int(n ** 1 / 2) + 1, 2): 
          
        # While i divides n 
        x = 0
        while (n % i == 0): 
            x += 1
            n = n / i 
        ans = ans * (x + 1) 
  
    # This condition is to handle the  
    # case when n is a prime number > 2 
    if (n > 2): 
        ans = ans * 2
  
    return ans 
  
def getTotalCount(n, k): 
    k_count = countDivisors(k) 
  
    # Count the total elements that 
    # have divisors exactly equal 
    # to as that of k's 
    count = 0
    for i in range(1, n): 
        if (k_count == countDivisors(i)): 
            count += 1
  
    # Exclude k from the result if it  
    # is smaller than n. 
    if (k < n): 
        count = count - 1
  
    return count 
  
# Driver code 
if __name__ == '__main__': 
    n, k = 500, 6
    print(getTotalCount(n, k)) 
  
# This code is contributed  
# by 29AjayKumar 

