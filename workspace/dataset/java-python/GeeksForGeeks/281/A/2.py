

# Python3 program to find the number of array  
# elements which can be derived by perming  
# (+A, -A, +B, -B) operations on D  
  
# Function to return gcd of a and b  
def gcd(a, b) : 
      
    if (a == 0) : 
        return b 
          
    return gcd(b % a, a);  
  
""" Function to Return the number of elements  
of arr[] which can be derived from D by  
performing (+A, -A, +B, -B) """
def findPossibleDerivables(arr, n, D, A, B) : 
  
    # find the gcd of A and B  
    gcdAB = gcd(A, B) 
      
    # counter stores the number of  
    # array elements which  
    # can be derived from D  
    counter = 0
  
    for i in range(n) : 
          
        # arr[i] can be derived from D only  
        # if |arr[i] - D| is divisible by  
        # gcd of A and B  
        if ((abs(arr[i] - D) % gcdAB) == 0) : 
            counter += 1
  
    return counter 
  
# Driver Code  
if __name__ == "__main__" :  
      
    arr = [ 1, 2, 3, 4, 7, 13 ]  
    n = len(arr) 
    D, A, B = 5, 4, 2
      
    print(findPossibleDerivables(arr, n, D, A, B)) 
  
    a = [ 1, 2, 3 ] 
    n = len(a) 
    D, A, B = 6, 3, 2
      
    print(findPossibleDerivables(a, n, D, A, B)) 
  
# This code is contributed by Ryuga 

