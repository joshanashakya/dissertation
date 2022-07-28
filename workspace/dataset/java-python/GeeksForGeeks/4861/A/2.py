

# This Python3 program gives result 
# approximated to 5 decimal places. 
def sqroot(s): 
  
    # This will be the nearest 
    # perfect square to s 
    pSq = 0;  
      
    # This is the sqrt of pSq 
    N = 0;  
  
    # Find the nearest  
    # perfect square to s 
    for i in range(int(s), 0, -1): 
        for j in range(1, i): 
            if (j * j == i): 
                pSq = i; 
                N = j; 
                break; 
      
        if (pSq > 0): 
            break; 
  
    d = s - pSq;     # calculate d 
    P = d / (2.0 * N); # calculate P 
    A = N + P; # calculate A 
      
    # calculate sqrt(S). 
    sqrt_of_s = A - ((P * P) / (2.0 * A));  
    return sqrt_of_s; 
  
# Driver Code 
num = 9.2345; 
sqroot_of_num = sqroot(num); 
print("Square root of ", num, "=",  
      round((sqroot_of_num * 100000.0) / 100000.0, 5)); 
  
# This code is contributed by mits 

