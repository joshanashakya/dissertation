

# Python3 program to find integer having  
# maximum number of prime factor in first 
# N natural numbers 
  
# Return smallest number having  
# maximum prime factors. 
def maxPrimefactorNum(N): 
  
    arr = [True] * (N + 5); 
  
    # Sieve of eratosthenes 
    i = 3; 
    while (i * i <= N): 
        if (arr[i]): 
            for j in range(i * i, N + 1, i): 
                arr[j] = False; 
        i += 2; 
  
    # Storing prime numbers. 
    prime = []; 
    prime.append(2); 
  
    for i in range(3, N + 1, 2): 
        if(arr[i]): 
            prime.append(i); 
  
    # Generating number having maximum  
    # prime factors. 
    i = 0; 
    ans = 1; 
    while (ans * prime[i] <= N and 
                    i < len(prime)): 
        ans *= prime[i]; 
        i += 1; 
  
    return ans; 
  
# Driver Code 
N = 40; 
print(maxPrimefactorNum(N)); 
  
# This code is contributed by mits 

