

# Python3 implementation of 
# above approach 
  
MAX = 1000000
  
# the sieve of prime number and 
# count of minimum prime factor 
sieve_Prime = [0 for i in range(MAX + 4)] 
sieve_count = [0 for i in range(MAX + 4)] 
  
# form the prime sieve 
def form_sieve(): 
      
    # 1 is not a prime number 
    sieve_Prime[1] = 1
  
    # form the sieve 
    for i in range(2, MAX + 1): 
  
        # if i is prime 
        if sieve_Prime[i] == 0: 
            for j in range(i * 2, MAX + 1, i): 
  
                # if i is the least prime factor 
                if sieve_Prime[j] == 0: 
  
                    # mark the number j  
                    # as non prime 
                    sieve_Prime[j] = 1
  
                    # count the numbers whose  
                    # least prime factor is i 
                    sieve_count[i] += 1
  
# Driver code 
  
# form the sieve 
form_sieve() 
  
n = 2
  
# display 
print("Count =", sieve_count[n] + 1) 
  
n = 3
  
# display 
print("Count =", sieve_count[n] + 1) 
  
# This code was contributed 
# by VishalBachchas 

