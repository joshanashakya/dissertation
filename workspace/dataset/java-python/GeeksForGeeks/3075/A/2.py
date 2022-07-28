

# Python 3 program to implement 
# multiplicative order 
  
# funnction for GCD 
def GCD (a, b ) : 
    if (b == 0 ) : 
        return a 
    return GCD( b, a % b )  
  
# Fucnction return smallest + ve 
# integer that holds condition  
# A ^ k(mod N ) = 1 
def multiplicativeOrder(A, N) : 
    if (GCD(A, N ) != 1) : 
        return -1
  
    # result store power of A that rised  
    # to the power N-1 
    result = 1
  
    K = 1
    while (K < N) : 
      
        # modular arithmetic 
        result = (result * A) % N  
  
        # return samllest + ve integer 
        if (result == 1) : 
            return K 
  
        # increment power 
        K = K + 1
      
    return -1
      
# Driver program 
A = 4
N = 7
print(multiplicativeOrder(A, N)) 
  
# This code is contributed by Nikita Tiwari. 

