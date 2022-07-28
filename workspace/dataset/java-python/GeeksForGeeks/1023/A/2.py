

# Python program to find 
# minimum GCD operations 
# to make all array elements one. 
  
#__gcd function 
def __gcd(a,b): 
  
    if (a == 0): 
        return b 
    return __gcd(b % a, a) 
   
# Function to count number of moves. 
def minimumMoves(A,N): 
  
    # Counting Number of ones. 
    one = 0
    for i in range(N):  
        if (A[i] == 1): 
            one+=1
   
    # If there is a one 
    if (one != 0):  
        return N - one  
       
    # Find smallest subarray with GCD equals 
    # to one. 
    minimum = +2147483647
    for i in range(N): 
        g = A[i] # to calculate GCD 
        for j in range(i + 1,N): 
            g = __gcd(A[j], g)  
            if (g == 1): 
                minimum = min(minimum, j - i)  
                break
   
    if (minimum == +2147483647): # Not Possible 
        return -1
    else: 
        return N + minimum - 1; # Final answer 
  
  
# Driver program 
A = [ 2, 4, 3, 9 ] 
N = len(A) 
print(minimumMoves(A, N)) 
  
# This code is contributed 
# by Anant Agarwal. 

