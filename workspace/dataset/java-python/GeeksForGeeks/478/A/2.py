

# Python3 implementation of above approach  
  
prime = [True] * (1000000 + 5)  
  
def findPrime():  
  
    prime[0], prime[1] = False, False
  
    for p in range(2, 1001):  
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if prime[p] == True:  
  
            # Update all multiples of p  
            for i in range(p * 2, 1000001, p): 
                prime[i] = False
  
# Function to find the length of longest  
# subarray having count of primes more  
# than count of non-primes  
def lenOfLongSubarr(arr, n):  
  
    # unordered_map 'um' implemented as  
    # hash table  
    um = {}  
    Sum, maxLen = 0, 0
  
    # traverse the given array  
    for i in range(0, n):  
  
        # consider -1 as non primes and 1 as primes  
        Sum = Sum-1 if prime[arr[i]] == False else Sum + 1
          
        # when subarray starts form index '0'  
        if Sum == 1:  
            maxLen = i + 1
  
        # make an entry for 'sum' if  
        # it is not present in 'um'  
        elif Sum not in um:  
            um[Sum] = i  
  
        # check if 'sum-1' is present  
        # in 'um' or not  
        if (Sum - 1) in um:  
  
            # update maxLength  
            if maxLen < (i - um[Sum - 1]):  
                maxLen = i - um[Sum - 1]  
  
    # required maximum length  
    return maxLen  
  
# Driver Code 
if __name__ == "__main__": 
  
    findPrime()  
  
    arr = [1, 9, 3, 4, 5, 6, 7, 8]  
    n = len(arr)  
  
    print(lenOfLongSubarr(arr, n)) 
  
# This code is contributed  
# by Rituraj Jain 

