

# Python3 program for above approach 
MAX = 100005
  
def addPrimes(): 
    n = MAX
  
    prime = [True for i in range(n + 1)] 
  
    for p in range(2, n + 1): 
  
        if p * p > n: 
            break
  
        if (prime[p] == True): 
            for i in range(2 * p, n + 1, p): 
                prime[i] = False
  
    ans = [] 
      
    # Store all prime numbers 
    for p in range(2, n + 1): 
        if (prime[p]): 
            ans.append(p) 
  
    return ans 
  
# Function to check if  
# a digit is odd prime or not 
def is_prime(n): 
    if n in [3, 5, 7]: 
        return True
    return False
  
# Function to find sum 
def find_Sum(n): 
      
    # To store required answer 
    Sum = 0
  
    # Get all prime numbers 
    v = addPrimes() 
  
    # Traverse through all the prime numbers 
    for i in range(len(v)): 
          
        # Flag stores 1 if a number does 
        # not contain any odd primes 
        flag = 1
        a = v[i] 
  
        # Find all digits of a number 
        while (a != 0): 
  
            d = a % 10; 
            a = a // 10; 
            if (is_prime(d)): 
                flag = 0
                break
  
        # If number does not contain any odd primes 
        if (flag == 1): 
            n -= 1
            Sum = Sum + v[i] 
        if n == 0: 
            break
  
    # Return the required answer 
    return Sum
  
# Driver code 
n = 7
  
# Function call 
print(find_Sum(n)) 
  
# This code is contributed by Mohit Kumar 

