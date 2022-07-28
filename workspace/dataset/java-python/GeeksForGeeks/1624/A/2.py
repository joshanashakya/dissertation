

# Python3 implementation of the approach  
  
def SieveOfEratosthenes(n):  
  
    # false here indicates  
    # that it is not prime  
    prime[1] = False
    p = 2
    while p * p <= n:  
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if prime[p]:  
  
            # Update all multiples of p,  
            # set them to non-prime  
            for i in range(p * 2, n + 1, p):  
                prime[i] = False
          
        p += 1
  
# Function that sorts all the prime  
# numbers from the array in descending  
def sortPrimes(arr, n):  
  
    SieveOfEratosthenes(100005)  
  
    # This vector will contain  
    # prime numbers to sort  
    v = []  
    for i in range(0, n):  
  
        # If the element is prime  
        if prime[arr[i]]:  
            v.append(arr[i])  
  
    v.sort(reverse = True)  
    j = 0
  
    # update the array elements  
    for i in range(0, n):  
        if prime[arr[i]]:  
            arr[i] = v[j] 
            j += 1
              
    return arr 
      
# Driver code  
if __name__ == "__main__":  
  
    arr = [4, 3, 2, 6, 100, 17]  
    n = len(arr)  
      
    prime = [True] * 100006
    arr = sortPrimes(arr, n)  
  
    # print the results.  
    for i in range(0, n):  
        print(arr[i], end = " ")  
      
# This code is contributed by Rituraj Jain 

