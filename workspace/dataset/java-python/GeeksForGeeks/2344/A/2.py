

# Python3 code implementation to find 
# sum of largest prime factor of  
# each number less than equal to n 
  
# function to find sum of largest  
# prime factor of each number less 
# than equal to n 
def sumOfLargePrimeFactor( n ): 
  
    # Create an integer array "prime[0..n]" 
    # and initialize all entries of it  
    # as 0. A value in prime[i] will  
    # finally be 0 if 'i' is a prime,  
    # else it will contain the largest 
    # prime factor of 'i'. 
    prime = [0] * (n + 1) 
    sum = 0
    max = int(n / 2) 
    for p in range(2, max + 1): 
          
        # If prime[p] is '0', then  
        # it is a prime number 
        if prime[p] == 0: 
              
            # Update all multiples of p 
            for i in range(p * 2, n + 1, p): 
                prime[i] = p 
                  
    # Sum up the largest prime factor 
    # of all the numbers 
    for p in range(2, n + 1): 
          
        # if 'p' is a non- prime  
        # number then prime[p] gives  
        # its largesr prime factor 
        if prime[p]: 
            sum += prime[p] 
          
        # 'p' is a prime number 
        else: 
            sum += p 
      
    # required sum 
    return sum
      
# Driver code to test above function 
n = 12
print("Sum =", sumOfLargePrimeFactor(n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

