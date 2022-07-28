

# Python3 implementation of the approach  
  
# Function to return the sum of all the  
# powers of k from the range [1, n]  
def sumPowersK(n, k) : 
  
    # To store the sum of the series  
    sum = 0; num = 1;  
  
    # While current power of k <= n  
    while (num <= n) : 
  
        # Add current power to the sum  
        sum += num;  
  
        # Next power of k  
        num *= k;  
  
    # Return the sum of the series  
    return sum;  
      
  
# Find to return the sum of the  
# elements from the range [1, n]  
# excluding those which are powers of k  
def getSum(n, k) : 
  
    # Sum of all the powers of k from [1, n]  
    pwrK = sumPowersK(n, k);  
  
    # Sum of all the elements from [1, n]  
    sumAll = (n * (n + 1)) / 2;  
  
    # Return the required sum  
    return (sumAll - pwrK);  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 10; k = 3;  
  
    print(getSum(n, k));  
      
# This code is contributed by AnkitRai01 

