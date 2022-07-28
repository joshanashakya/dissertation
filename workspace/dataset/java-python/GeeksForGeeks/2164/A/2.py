

# Python 3 program to count all sub-arrays  
# whose product does not contain a repeating  
# prime factor. 
from math import sqrt 
  
MAXN = 1000001
spf = [0 for i in range(MAXN)] 
  
# Calculating SPF (Smallest Prime Factor)  
# for every number till MAXN. 
# Time Complexity : O(n log log n) 
def sieve(): 
      
    # marking smallest prime factor  
    # for every number to be itself. 
    for i in range(1, MAXN, 1): 
        spf[i] = i 
  
    # separately marking spf for  
    # every even number as 2 
    for i in range(4, MAXN, 2): 
        spf[i] = 2
      
    k = int(sqrt(MAXN)) 
    for i in range(3, k, 1): 
          
        # checking if i is prime 
        if (spf[i] == i): 
              
            # marking SPF for all numbers  
            # divisible by i 
            for j in range(i * i, MAXN, i): 
                  
                # marking spf[j] if it is  
                # not previously marked 
                if (spf[j] == j): 
                    spf[j] = i 
  
# Function to count all sub-arrays whose 
# product doesn't contain a repeating  
# prime factor. 
def countSubArray(arr, n): 
      
    # ind[i] is going to store 1 + last  
    # index of an array element which  
    # has i as prime factor. 
    ind = [-1 for i in range(MAXN)] 
  
    count = 0
      
    # Initiaize result 
    last_ind = 0
      
    # It stores index 
    for i in range(0, n, 1): 
        while (arr[i] > 1): 
            div = spf[arr[i]] 
  
            # Fetch the last index of prime 
            # divisor of element 
            last_ind = max(last_ind, ind[div]) 
  
            # Update the current divisor index 
            ind[div] = i + 1
  
            arr[i] = int(arr[i] / div) 
              
        # Update result, we basically include 
        # all required subarrays ending with 
        # index arr[i]. 
        count += i - last_ind + 1
    return count 
  
# Driver code 
if __name__ == '__main__': 
    sieve() 
    arr = [2, 3, 9] 
    n = len(arr) 
    print(countSubArray(arr, n)) 
  
    arr1 = [2, 3, 5, 15, 7, 2] 
    n1 = len(arr1) 
    print(countSubArray(arr1, n1)) 
  
# This code is contributed by 
# Shashank_Sharma 

