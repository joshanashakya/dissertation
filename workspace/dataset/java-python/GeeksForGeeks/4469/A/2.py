

# Python3 program to find number of log values 
# needed to calculate all the log values 
# from 1 to N 
  
MAX = 1000005
  
# In this list prime[i] will store true 
# if prime[i] is prime, else store false 
prime = [True for i in range(MAX)] 
  
# Using sieve of Eratosthenes to find 
# all prime upto N 
def seive(N): 
  
    prime[0], prime[1] = False, False
  
    for i in range(2, N + 1): 
        if(prime[i]): 
            for j in range(2, N + 1): 
                if(i * j > N): 
                    break
                prime[i * j] = False
  
  
# Function to find number of log values needed 
# to calculate all the log values from 1 to N 
def countLogNeeded(N): 
  
    count = 0
  
    # calculate primes upto N 
    seive(N) 
  
    for i in range(1, N + 1): 
        if(prime[i]): 
            count = count + 1
  
    return count 
  
# Driver code 
if __name__=='__main__': 
    N = 6
    print(countLogNeeded(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

