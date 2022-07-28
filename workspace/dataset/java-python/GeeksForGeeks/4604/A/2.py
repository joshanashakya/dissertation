

# Python3 program to find sum of  
# n-th terms of a Fibonacci like  
# series formed using first two  
# terms of two arrays. 
def sumNth(A, B, m, n): 
  
    res = 0; 
  
    # if sum of first term is required 
    if (n == 1): 
        for i in range(m): 
            res = res + A[i]; 
  
    # if sum of second term is required 
    elif (n == 2):  
        for i in range(m): 
            res = res + B[i] * m; 
  
    else: 
          
        # fibonacci series used to find  
        # the nth term of every series 
        f = [0] * n; 
        f[0] = 0; 
        f[1] = 1; 
        for i in range(2, n): 
            f[i] = f[i - 1] + f[i - 2]; 
  
        for i in range(m): 
  
            # as every b[i] term appears m  
            # times and every a[i] term also 
            # appears m times 
            res = (res + (m * (B[i] * f[n - 1])) + 
                         (m * (A[i] * f[n - 2]))); 
  
    return res; 
  
# Driver code 
      
# m is the size of the array 
A = [1, 2, 3 ]; 
B = [4, 5, 6 ]; 
n = 3; 
m = len(A); 
print(sumNth(A, B, m, n)); 
  
# This code is contributed by mits 

