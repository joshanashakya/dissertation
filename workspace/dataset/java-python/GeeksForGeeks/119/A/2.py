

# Python 3 Program to find  
# sum of all factors of a 
# given number  
  
# Using SieveOfEratosthenes  
# to find smallest prime  
# factor of all the numbers.  
# For example, if N is 10,  
# s[2] = s[4] = s[6] = s[10] = 2  
# s[3] = s[9] = 3  
# s[5] = 5  
# s[7] = 7  
def sieveOfEratosthenes(N, s) : 
  
    # Create a boolean list "prime[0..n]"  
    # and initialize all entries in it  
    # as false. 
    prime = [False] * (N + 1) 
  
    # Initializing smallest  
    # factor equal to 2 for  
    # all the even numbers  
    for i in range(2, N + 1, 2) : 
        s[i] = 2
  
    # For odd numbers less 
    # then equal to n  
    for i in range(3, N + 1, 2) : 
  
        if prime[i] == False : 
  
            # s[i] for a prime is 
            # the number itself  
            s[i] = i 
  
            # For all multiples of  
            # current prime number  
            for j in range(i, (N + 1) // i, 2) : 
                  
                if prime[i * j] == False : 
                    prime[i * j] = True
                      
                    # i is the smallest 
                    # prime factor for  
                    # number "i*j".  
                    s[i * j] = i 
  
                #J += 2 
  
# Function to find sum 
# of all prime factors 
def findSum(N) : 
  
    # Declaring list to store  
    # smallest prime factor of 
    # i at i-th index  
    s = [0] * (N + 1) 
    ans = 1
  
    # Filling values in s[] using  
    # sieve function calling 
    sieveOfEratosthenes(N, s) 
  
    # Current prime factor of N 
    currFactor = s[N] 
  
    # Power of current prime factor 
    power = 1
  
    while N > 1 : 
        N //= s[N] 
  
        # N is now N//s[N]. If new N  
        # also has smallest prime  
        # factor as currFactor,  
        # increment power 
        if currFactor == s[N] : 
            power += 1
            continue
  
        sum = 0
  
        for i in range(power + 1) : 
            sum += pow(currFactor, i) 
  
        ans *= sum
  
        # Update current prime factor  
        # as s[N] and initializing  
        # power of factor as 1.  
        currFactor = s[N] 
        power = 1
          
    return ans  
  
# Driver Code 
if __name__ == "__main__" : 
  
    n = 12
    print("Sum of the factors is :", end = " ") 
    print(findSum(n)) 
      
# This code is contributed by ANKITRAI1 

