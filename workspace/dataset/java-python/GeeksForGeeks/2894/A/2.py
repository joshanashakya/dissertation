

# Python 3 program to print the Kth 
# prime greater than N  
  
# set the MAX_SIZE of the array to 10^6 
MAX_SIZE = int(1e6) 
  
# initialize the prime array 
prime = [True] * (MAX_SIZE + 1) 
  
# Code for Sieve of Eratosthenes 
def seive(): 
    p = 2
      
    while (p * p <= MAX_SIZE): 
          
        # if prime[p] is not changed,  
        # then it is a prime 
        if (prime[p] == True): 
              
            # update all multiples of p  
            for i in range(p * p, MAX_SIZE, p): 
                prime[i] = False
        p += 1
  
# Function to find the kth prime 
# greater than n  
def kthPrimeGreaterThanN(n, k): 
    res = -1
      
    # looping through the numbers  
    # greater than n  
    for i in range(n + 1, MAX_SIZE): 
          
        # decrement k if i is prime 
        if (prime[i] == True): 
            k -= 1
          
        # store the kth prime greater than n 
        if (k == 0): 
            res = i 
            break
      
    return res 
  
# Driver Code 
if __name__=='__main__':  
    n = 2
    k = 15
    seive() 
      
    # Print the kth prime number  
    # greater than n  
    print(kthPrimeGreaterThanN(n, k)) 
      
# This code is contributed by Rupesh Rao 

