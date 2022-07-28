

# Python program to find the sum of the  
# elements of an array whose prime factors 
# are present in the same array  
from collections import defaultdict 
  
MAXN = 1000001
MAXN_sqrt = int(MAXN ** (0.5)) 
  
# Stores smallest prime factor 
# for every number  
spf = [None] * (MAXN)  
  
# Function to calculate SPF (Smallest  
# Prime Factor) for every number till MAXN  
def sieve(): 
  
    spf[1] = 1
    for i in range(2, MAXN):  
  
        # Marking smallest prime factor  
        # for every number to be itself.  
        spf[i] = i  
  
    # Separately marking spf for every  
    # even number as 2  
    for i in range(4, MAXN, 2):  
        spf[i] = 2
  
    for i in range(3, MAXN_sqrt):  
  
        # If i is prime  
        if spf[i] == i: 
  
            # Marking SPF for all numbers  
            # divisible by i  
            for j in range(i * i, MAXN, i):  
  
                # Marking spf[j] if it is   
                # not previously marked  
                if spf[j] == j: 
                    spf[j] = i  
          
# Function to return the sum of the elements  
# of an array whose prime factors are present  
# in the same array  
def sumFactors(arr, n):  
  
    # Function call to calculate smallest  
    # prime factors of all the numbers upto MAXN  
    sieve()  
  
    # Create map for each element  
    Map = defaultdict(lambda:0)  
  
    for i in range(0, n):  
        Map[arr[i]] = 1
  
    Sum = 0
  
    for i in range(0, n):  
        num = arr[i]  
          
        # If smallest prime factor of num 
        # is present in array  
        while num != 1 and Map[spf[num]] == 1:  
            num = num // spf[num]  
          
        # Each factor of arr[i] is present  
        # in the array  
        if num == 1:  
            Sum += arr[i]  
      
    return Sum
  
# Driver Code 
if __name__ == "__main__": 
  
    arr = [5, 11, 55, 25, 100]  
    n = len(arr)  
  
    # Function call to print  
    # required answer  
    print(sumFactors(arr, n))  
  
# This code is contributed by Rituraj Jain 

