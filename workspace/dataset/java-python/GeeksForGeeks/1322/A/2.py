

# Python implementation of the above approach 
isPrime = (int(1e5)+5)*[True] 
  
# Function to return the reverse 
# of a number 
def reverse(n): 
    temp = n 
    sum = 0
    while temp>0: 
        rem = temp % 10
        sum = sum * 10 + rem 
        temp//= 10
  
    return sum
  
# Function to generate mirror reflection 
# of a number 
def mirror(n): 
    temp = n 
    sum = 0
    while temp>0: 
        rem = temp % 10
        if rem == 2: 
            rem = 5
        elif rem == 5: 
            rem = 2
        sum = sum * 10 + rem 
        temp//= 10
  
    return sum
  
# Function to initialize prime number sieve 
def sieve(): 
  
    isPrime[0] = isPrime[1] = False
  
    for i in range(2, int(1e5)+1): 
        j = 2
        while i * j<= int(1e5): 
            isPrime[i * j] = False
            j+= 1
  
  
# Function that returns true if n is 
# Dihedral Prime number 
def isDihedralPrime(n): 
      
    # Check if the orientations of n is also prime 
    if (not isPrime[n]) or (not isPrime[mirror(n)]) \ 
        or (not isPrime[reverse(n)]) \ 
        or (not isPrime[reverse(mirror(n))]): 
        return False
  
    temp = n 
  
    while temp>0: 
        rem = temp % 10; 
        if rem == 3 or rem == 4 or \ 
            rem == 6 or rem == 7 or rem == 9: 
            return False
        temp//= 10
  
    return True
  
# Driver code 
if __name__ == '__main__': 
  
    sieve() 
      
    n = 18181
    if isDihedralPrime(n): 
        print("Yes") 
    else : 
        print("No") 

