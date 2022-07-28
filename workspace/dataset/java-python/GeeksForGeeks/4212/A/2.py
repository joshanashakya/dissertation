

# Python3 code to find number  
# occurring prime number of 
# times with frequency >= k 
  
# Function to find number  
# with prime occurrences 
def primeOccurences(arr, k): 
    map = {} 
  
    # Insert values and their frequencies 
    for val in arr: 
        freq = 0
          
        if val in map : 
            freq = map[val] 
            freq += 1
              
        else : 
            freq = 1
        map[val] = freq 
  
    # Traverse map and find elements  
    # with prime frequencies and  
    # frequency at least k 
    for entry in map : 
        value = map[entry] 
          
        if isPrime(value) and value >= k: 
            print(entry) 
  
# Check if the number of occurrences 
# are primes or not 
def isPrime(n): 
  
    if (n > 2 and not n % 2) or n == 1: 
        return False     
  
    for i in range(3, int(n**0.5 + 1), 2): 
        if not n % i: 
            return False
              
    return True
  
  
# Driver code 
  
arr = [ 11, 11, 11, 23, 11, 37, 
        37, 51, 51, 51, 51, 51 ] 
k = 2
  
primeOccurences(arr, k) 
  
  
# This code is contributed by Ansu Kumari. 

