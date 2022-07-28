

# Python3 implementation of the above approach  
  
# This function finds all  
# prime numbers upto 10 ^ 5 
def findPrime(MAX):  
  
    pm = [True] * (MAX + 1)  
  
    # use sieve to find prime  
    pm[0], pm[1] = False, False
      
    for i in range(2, MAX + 1):  
        if pm[i] == True: 
              
            for j in range(2 * i, MAX + 1, i):  
                pm[j] = False
  
    # If number is prime, then  
    # store it in prime list  
    prime = [] 
    for i in range(0, MAX + 1):  
        if pm[i] == True:  
            prime.append(i)  
  
    return prime  
  
# Function to find the smallest prime missing  
def findSmallest(arr, n):  
  
    MAX = max(arr) 
      
    # first of all find all prime  
    prime = findPrime(MAX)  
  
    # now store all number as index of freq  
    # arr so that we can improve searching  
    s = set()  
    for i in range(0, n):  
        s.add(arr[i])  
  
    # now check for each prime  
    ans = -1
    for i in range(0, len(prime)):  
        if prime[i] not in s:  
            ans = prime[i]  
            break
          
    return ans  
  
# Driver Code 
if __name__ == "__main__": 
  
    arr = [3, 0, 1, 2,  7]  
    n = len(arr)  
  
    # find smallest prime  
    # which is not present  
    if(findSmallest(arr, n) == -1): 
        print("No prime number missing") 
    else: 
        print(findSmallest(arr, n)) 
  
# This code is contributed by Rituraj Jain 

