

# Python3 program to find number  
# of unordered coprime pairs of 
# integers from 1 to N 
N = 100005
  
# to store euler's totient function 
phi = [0] * N 
  
# to store required answer 
S = [0] * N 
  
# Computes and prints totient of all  
# numbers smaller than or equal to N. 
def computeTotient(): 
  
    # Initialise the phi[] with 1 
    for i in range(1, N): 
        phi[i] = i 
  
    # Compute other Phi values 
    for p in range(2, N) : 
  
        # If phi[p] is not computed already, 
        # then number p is prime 
        if (phi[p] == p) : 
  
            # Phi of a prime number p  
            # is always equal to p-1. 
            phi[p] = p - 1
  
            # Update phi values of all 
            # multiples of p 
            for i in range(2 * p, N, p) : 
  
                # Add contribution of p to its 
                # multiple i by multiplying with 
                # (1 - 1/p) 
                phi[i] = (phi[i] // p) * (p - 1) 
  
# function to compute number  
# coprime pairs 
def CoPrimes(): 
      
    # function call to compute 
    # euler totient function 
    computeTotient() 
  
    # prefix sum of all euler  
    # totient function values 
    for i in range(1, N): 
        S[i] = S[i - 1] + phi[i] 
  
# Driver code 
if __name__ == "__main__": 
      
    # function call 
    CoPrimes() 
  
    q = [ 3, 4 ] 
    n = len(q) 
  
    for i in range(n): 
        print("Number of unordered coprime\n" + 
              "pairs of integers from 1 to ",  
               q[i], " are " , S[q[i]]) 
  
# This code is contributed  
# by ChitraNayal 

