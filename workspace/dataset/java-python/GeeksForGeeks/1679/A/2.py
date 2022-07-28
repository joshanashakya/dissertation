

# Python 3 program to count pair with 
# bitwise-AND as even number 
  
# Function to count number of pairs 
# with EVEN bitwise AND 
def findevenPair(A, N): 
    count = 0
  
    # count odd numbers 
    for i in range(0, N): 
        if (A[i] % 2 != 0): 
            count += 1
  
    # count odd pairs 
    oddCount = count * (count - 1) / 2
  
    # return number of even pair 
    return (int)((N * (N - 1) / 2) - oddCount) 
  
# Driver Code 
a = [5, 1, 3, 2 ] 
n = len(a) 
  
print(findevenPair(a, n)) 
  
# This code is contributed  
# by PrinciRaj1992  

