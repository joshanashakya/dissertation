

# Python3 program to check Euclid Number  
MAX = 10000
  
s = set()  
  
# Function to generate the Prime numbers  
# and store their products  
def SieveOfEratosthenes():  
  
    # Create a boolean array "prime[0..n]"  
    # and initialize all entries it as true.  
    # A value in prime[i] will finally be 
    # false if i is Not a prime, else true.  
    prime = [True] * (MAX)  
    prime[0], prime[1] = False, False
      
    for p in range(2, 100): 
          
        # If prime[p] is not changed,  
        # then it is a prime  
        if prime[p] == True:  
  
            # Update all multiples of p  
            for i in range(p * 2, MAX, p):  
                prime[i] = False
  
    # store prefix product of prime numbers  
    # to unordered_set 's'  
    product = 1
  
    for p in range(2, MAX):  
  
        if prime[p] == True: 
  
            # update product by multipying  
            # next prime  
            product = product * p  
  
            # insert 'produc+1' to set  
            s.add(product + 1)  
  
# Function to check the number  
# for Euclid Number  
def isEuclid(n): 
  
    # Check if number exist in  
    # unordered set or not  
    # If exist, return true  
    if n in s:  
        return True
    else: 
        return False
  
# Driver code  
if __name__ == "__main__": 
  
    # Get the prime numbers  
    SieveOfEratosthenes()  
  
    # Get n  
    n = 31
  
    # Check if n is Euclid Number  
    if isEuclid(n) == True:  
        print("YES")  
    else: 
        print("NO")  
  
    # Get n  
    n = 42
  
    # Check if n is Euclid Number  
    if isEuclid(n) == True:  
        print("YES")  
    else: 
        print("NO")  
  
# This code is contributed by Rituraj Jain 

