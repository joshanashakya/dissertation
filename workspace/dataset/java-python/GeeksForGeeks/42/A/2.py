

# Python3 implementation of the above approach 
  
# Function to return an array  
# of prime numbers upto n  
# using Sieve of Eratosthenes 
def seive(n): 
    prime =[True]*(n + 1) 
    p = 2
    while(p * p<= n): 
        if(prime[p] == True): 
            for i in range(p * p, n + 1, p): 
                prime[i] = False
        p += 1
    allPrimes = [x for x in range(2, n)if prime[x]] 
    return allPrimes 
  
# Function to return distinct  
# prime factors from the given array  
def distPrime(arr, allPrimes): 
  
    # Creating an empty array 
    # to store distinct prime factors 
    list1 = list() 
      
    # Iterating through all the  
    # prime numbers and check if  
    # any of the prime numbers is a 
    # factor of the given input array 
    for i in allPrimes: 
        for j in arr: 
            if(j % i == 0): 
                list1.append(i) 
                break
    return list1 
  
# Driver code 
if __name__=="__main__": 
  
    # Finding prime numbers upto 10000 
    # using Sieve of Eratosthenes 
    allPrimes = seive(10000) 
  
    arr = [15, 30, 60] 
    ans = distPrime(arr, allPrimes) 
    print(ans) 
  
# This code is contributed by mohit kumar 29 

