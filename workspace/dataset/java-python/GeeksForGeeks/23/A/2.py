

# A O(Log n) program to find n-th Leonardo 
# number. 
  
# Helper function that multiplies 2 matrices  
# F and M of size 2 * 2, and puts the  
# multiplication result back to F[][]  
def multiply(F, M ) : 
    x = F[0][0] * M[0][0] + F[0][1] * M[1][0] 
    y = F[0][0] * M[0][1] + F[0][1] * M[1][1] 
    z = F[1][0] * M[0][0] + F[1][1] * M[1][0] 
    w = F[1][0] * M[0][1] + F[1][1] * M[1][1] 
    F[0][0] = x 
    F[0][1] = y 
    F[1][0] = z 
    F[1][1] = w 
   
def power(F, n) : 
    M = [[ 1, 1 ], [ 1, 0 ] ] 
   
    # n - 1 times multiply the matrix 
    # to {{1, 0}, {0, 1}} 
    for i in range(2, n + 1) : 
        multiply(F, M) 
          
  
def fib(n) : 
    F = [ [ 1, 1 ], [ 1, 0 ] ] 
    if (n == 0) : 
        return 0
    power(F, n - 1) 
    return F[0][0] 
   
def leonardo(n) : 
    if (n == 0 or n == 1) : 
        return 1
    return (2 * fib(n + 1) - 1) 
      
# main method     
print(leonardo(3)) 
  
# This code is contributed by Nikita Tiwari. 

