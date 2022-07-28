

# Python3 program to find sum of elements 
# in an array having composite frequency 
  
N = 100005
  
# Function to create 
# Sieve to check primes 
def SieveOfEratosthenes(composite): 
  
    for p in range(2, N): 
        if p*p > N: 
            break
  
        # If composite[p] is not changed, 
        # then it is a prime 
        if (composite[p] == False): 
  
            # Update all multiples of p, 
            # set them to composite 
            for i in range(2*p, N, p): 
                composite[i] = True
  
# Function to return the sum of elements 
# in an array having composite frequency 
def sumOfElements(arr, n): 
    composite = [False] * N 
  
    SieveOfEratosthenes(composite) 
  
    # Map is used to store 
    # element frequencies 
    m = dict(); 
    for i in range(n): 
        m[arr[i]] = m.get(arr[i], 0) + 1
  
    # To store sum 
    sum = 0
  
    # Traverse the map using iterators 
    for it in m: 
  
        # Count the number of elements 
        # having composite frequencies 
        if (composite[m[it]]): 
            sum += (it) 
  
    return sum
  
# Driver code 
if __name__ == '__main__': 
    arr=[1, 2, 1, 1, 1,3, 3, 2, 4] 
  
    n = len(arr) 
  
    # Function call 
    print(sumOfElements(arr, n)) 
  
# This code is contributed by mohit kumar 29 

