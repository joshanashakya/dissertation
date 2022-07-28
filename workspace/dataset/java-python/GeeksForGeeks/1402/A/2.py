

# Python implementation of the approach  
  
# Function to return the minimum  
# possible sum of digits of A  
# and B such that A + B = n  
def minSum(n) :  
  
    # Find the sum of digits of n  
    sum = 0;  
    while (n > 0) : 
        sum += (n % 10);  
        n //= 10;  
  
    # If num is a power of 10  
    if (sum == 1) : 
        return 10;  
  
    return sum;  
  
# Driver code  
if __name__ == "__main__" :  
    n = 1884;  
  
    print(minSum(n));  
  
# This code is contributed by AnkitRai01 

