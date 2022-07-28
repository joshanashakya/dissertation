

# Python3 program to print prime 
# factors and their powers  
# using Sieve Of Eratosthenes 
  
# Using SieveOfEratosthenes to 
# find smallest prime factor  
# of all the numbers. 
  
# For example, if N is 10, 
# s[2] = s[4] = s[6] = s[10] = 2 
# s[3] = s[9] = 3 
# s[5] = 5 
# s[7] = 7 
def sieveOfEratosthenes(N, s): 
      
    # Create a boolean array  
    # "prime[0..n]" and initialize 
    # all entries in it as false. 
    prime = [False] * (N+1) 
  
    # Initializing smallest factor 
    # equal to 2 for all the even  
    # numbers 
    for i in range(2, N+1, 2):  
        s[i] = 2
  
    # For odd numbers less then  
    # equal to n 
    for i in range(3, N+1, 2): 
        if (prime[i] == False): 
              
            # s(i) for a prime is 
            # the number itself 
            s[i] = i 
  
            # For all multiples of 
            # current prime number 
            for j in range(i, int(N / i) + 1, 2): 
                if (prime[i*j] == False): 
                    prime[i*j] = True
  
                    # i is the smallest  
                    # prime factor for 
                    # number "i*j". 
                    s[i * j] = i 
  
# Function to generate prime 
# factors and its power 
def generatePrimeFactors(N): 
  
    # s[i] is going to store 
    # smallest prime factor  
    # of i. 
    s = [0] * (N+1) 
  
    # Filling values in s[]  
    # using sieve 
    sieveOfEratosthenes(N, s) 
  
    print("Factor Power") 
  
    # Current prime factor of N 
    curr = s[N] 
      
    # Power of current prime factor 
    cnt = 1 
  
    # Printing prime factors and  
    #their powers 
    while (N > 1): 
        N //= s[N] 
  
        # N is now N/s[N]. If new N  
        # als has smallest prime  
        # factor as curr, increment 
        # power 
        if (curr == s[N]): 
            cnt += 1
            continue
  
        print(str(curr) + "\t" + str(cnt)) 
  
        # Update current prime factor 
        # as s[N] and initializing  
        # count as 1. 
        curr = s[N] 
        cnt = 1
  
#Driver Program 
N = 360
generatePrimeFactors(N) 
  
# This code is contributed by Ansu Kumari 

