

# Python 3 program to count number of  
# divisors of N which are divisible by K 
import math 
  
# Function to count number of divisors 
# of N which are divisible by K 
def countDivisors(n, k): 
      
    # integer to count the divisors 
    count = 0
  
    # Traverse from 1 to sqrt(N) 
    for i in range(1, int(math.sqrt(n)) + 1): 
  
        # Check if i is a factor 
        if (n % i == 0) : 
              
            # increase the count if i 
            # is divisible by k 
            if (i % k == 0) : 
                count += 1
  
            # (n/i) is also a factor check 
            # whether it is divisible by k 
            if ((n // i) % k == 0) : 
                count += 1
  
    # If the number is a perfect square 
    # and it is divisible by k 
    # if i is sqrt reduce by 1 
    if ((i * i == n) and (i % k == 0)) : 
        count -= 1  
  
    return count 
  
# Driver code 
if __name__ == "__main__": 
    n = 12
    k = 3
  
    print(countDivisors(n, k)) 
  
# This code is contributed  
# by ChitraNayal 

