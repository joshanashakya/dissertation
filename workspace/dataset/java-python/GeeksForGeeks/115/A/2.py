

# Python program to print the nearest prime  
# number by sequentially adding the prime numbers  
  
# Function to store prime numbers using prime seive 
def prime_seive(MAX, isprime, prime): 
      
    # iterate for all the numbers  
    i = 2
    while (i * i <= MAX): 
           
        # If prime[p] is not changed,  
        # then it is a prime 
        if (isprime[i] == 1): 
              
            # append the prime to the list  
            prime.append(i) 
              
            # Update all multiples of p 
            for j in range(i * 2, MAX, i): 
                isprime[j] = 0
                  
        i += 1
          
          
  
# Function to print the nearest prime  
def printNearest(N): 
      
    MAX = 10**6 
      
    # store all the index with 1  
    isprime = [1] * MAX
      
    # 0 and 1 are not prime  
    isprime[0] = isprime[1] = 0 
      
    # list to store prime numbers 
    prime = [] 
      
    # variable to add primes  
    i = 0
      
    # call the seive function  
    prime_seive(MAX, isprime, prime) 
      
    # Keep on adding prime numbers  
    # till the nearest prime number  
    # is achieved  
    while not isprime[N]: 
        N += prime[i] 
        i += 1
      
    # return the nearest prime  
    return N  
    
  
# Driver Code  
N = 8
print(printNearest(N)) 

