

# Python3 implementation of the above approach  
  
MAX = 1000001 
MAX_sqrt = MAX ** (0.5) 
    
# primeUpto[i] denotes count of prime  
# numbers upto i  
primeUpto = [0] * (MAX)  
    
# Function to compute all prime numbers  
# and update primeUpto array  
def SieveOfEratosthenes():  
   
    isPrime = [1] * (MAX)  
      
    # 0 and 1 are not primes  
    isPrime[0], isPrime[1] = 0, 0 
    for i in range(2, int(MAX_sqrt)):   
    
        # If i is prime  
        if isPrime[i] == 1: 
    
            # Set all multiples of i as non-prime  
            for j in range(i * 2, MAX, i):  
                isPrime[j] = 0 
    
    # Compute primeUpto array  
    for i in range(1, MAX): 
        primeUpto[i] = primeUpto[i - 1]  
        if isPrime[i] == 1:  
            primeUpto[i] += 1 
   
    
# Function to return the count  
# of valid numbers  
def countOfNumbers(N, K):  
    
    # Compute primeUpto array  
    SieveOfEratosthenes()  
    low, high, ans = 1, N, 0 
    while low <= high:   
        mid = (low + high) >> 1 
    
        # Check if the number is  
        # valid, try to reduce it  
        if mid - primeUpto[mid] >= K:   
            ans = mid  
            high = mid - 1 
           
        else: 
            low = mid + 1 
    
    # ans is the minimum valid number  
    return (N - ans + 1) if ans else 0 
   
    
# Driver Code  
if __name__ == "__main__": 
   
    N, K = 10, 3  
    print(countOfNumbers(N, K)) 
   
 # This code is contributed by Rituraj Jain 

