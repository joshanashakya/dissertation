

# Python3 implementation of the approach 
MAXN = 1000001
  
# Stores smallest prime factor for  
# every number 
spf = [i for i in range(MAXN)] 
  
# Hash to store prime factors count 
hash1 = [0 for i in range(MAXN)] 
  
# Function to calculate SPF (Smallest  
# Prime Factor) for every number till MAXN 
def sieve(): 
  
    # Separately marking spf for  
    # every even number as 2 
    for i in range(4, MAXN, 2): 
        spf[i] = 2
  
    # Checking if i is prime 
    for i in range(3, MAXN): 
  
        if i * i < MAXN: 
            break
  
        # Marking SPF for all numbers 
        # divisible by i 
        if (spf[i] == i): 
            for j in range(i * i, MAXN, i): 
  
                # Marking spf[j] if it is not 
                # previously marked 
                if (spf[j] == j): 
                    spf[j] = i 
  
# Function to store the prime factors  
# after dividing by the smallest prime  
# factor at every step 
def getFactorization(x): 
  
    while (x != 1): 
        temp = spf[x] 
        if (x % temp == 0): 
  
            # Storing the count of 
            # prime factors in hash 
            hash1[spf[x]] += 1
            x = x // spf[x] 
  
        while (x % temp == 0): 
            x = x // temp 
  
# Function that returns true if there  
# are no common prime factors between x 
# and other numbers of the array 
def check(x): 
  
    while (x != 1): 
        temp = spf[x] 
  
        # Checking whether it common 
        # prime factor with other numbers 
        if (x % temp == 0 and hash1[temp] > 1): 
            return False
        while (x % temp == 0): 
            x = x //temp 
      
    return True
  
# Function that returns true if there is 
# an element in the array which is coprime 
# with all the other elements of the array 
def hasValidNum(arr, n): 
  
    # Using sieve for generating  
    # prime factors 
    sieve() 
  
    for i in range(n): 
        getFactorization(arr[i]) 
  
    # Checking the common prime factors 
    # with other numbers 
    for i in range(n): 
        if (check(arr[i])): 
            return True
  
    return False
  
# Driver code 
arr = [2, 8, 4, 10, 6, 7] 
n = len(arr) 
  
if (hasValidNum(arr, n)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by mohit kumar 

