

# Python 3 implementation of 
# above approach 
  
# Function to count factors in O(N) 
def numberOfDivisors(num): 
    c = 0
  
    # iterate and check if  
    # factor or not 
    for i in range(1, num + 1) : 
        if (num % i == 0) : 
            c += 1
          
    return c 
  
# Function to count numbers having 
# exactly 9 divisors 
def countNumbers(n): 
  
    c = 0
  
    # check for all numbers <=N 
    for i in range(1, n + 1) : 
          
        # check if exactly 9 factors or not 
        if (numberOfDivisors(i) == 9): 
            c += 1
    return c 
  
# Driver Code 
if __name__ == "__main__": 
    n = 1000
  
    print(countNumbers(n)) 
  
# This code is contributed 
# by ChitraNayal 

