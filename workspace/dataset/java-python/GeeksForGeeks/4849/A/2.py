

# Python3 implementation to find 
# n'th smart number  
  
# Limit on result  
MAX = 3000;  
  
# Function to calculate n'th 
# smart number  
def smartNumber(n):  
  
    # Initialize all numbers as not prime  
    primes = [0] * MAX;  
  
    # iterate to mark all primes  
    # and smart number  
    result = [];  
  
    # Traverse all numbers till maximum limit  
    for i in range(2, MAX):  
          
        # 'i' is maked as prime number because  
        # it is not multiple of any other prime  
        if (primes[i] == 0):  
            primes[i] = 1;  
  
            # mark all multiples of 'i' as non prime 
            j = i * 2; 
            while (j < MAX):  
                primes[j] -= 1;  
  
                # If i is the third prime factor of j  
                # then add it to result as it has at  
                # least three prime factors.  
                if ( (primes[j] + 3) == 0):  
                    result.append(j); 
                j = j + i; 
  
    # Sort all smart numbers  
    result.sort();  
  
    # return n'th smart number  
    return result[n - 1];  
  
# Driver Code 
n = 50;  
print(smartNumber(n));  
  
# This code is contributed by mits  

