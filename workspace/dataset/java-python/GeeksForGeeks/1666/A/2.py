

# Python3 implemenation to find sum of all 
# proper divisor of number up to N 
  
# Utility function to find sum of 
# all proper divisor of number up to N 
def properDivisorSum(n): 
  
    sum = 0
  
    # Loop to iterate over all the 
    # numbers from 1 to N 
    for i in range(n+1): 
  
        # Find all divisors of 
        # i and add them 
        for j in range(1, i + 1): 
            if j * j > i: 
                break
            if (i % j == 0): 
                if (i // j == j): 
                    sum += j 
                else: 
                    sum += j + i // j 
  
        # Subtracting 'i' so that the 
        # number itself is not included 
        sum = sum - i 
  
    return sum
  
# Driver Code 
if __name__ == '__main__': 
  
    n = 4
    print(properDivisorSum(n)) 
  
    n = 5
    print(properDivisorSum(n)) 
  
# This code is contributed by mohit kumar 29 

