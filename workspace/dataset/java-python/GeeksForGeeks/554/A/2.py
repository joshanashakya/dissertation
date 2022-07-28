

# Python3 program to find maximum number  
# of prime factors in first N natural numbers  
  
# Return maximum number of prime factors  
# for any number in [1, N]  
def maxPrimefactorNum(N):  
  
    if (N < 2):  
        return 0;  
  
    arr = [True] * (N + 1);  
    prod = 1;  
    res = 0; 
    p = 2; 
    while (p * p <= N): 
          
        # If p is prime  
        if (arr[p] == True):  
            for i in range(p * 2, N + 1, p):  
                arr[i] = False;  
  
            # We simply multiply first set  
            # of prime numbers while the  
            # product is smaller than N.  
            prod *= p;  
            if (prod > N):  
                return res;  
            res += 1; 
        p += 1; 
  
    return res;  
  
# Driver Code  
N = 500;  
print(maxPrimefactorNum(N));  
  
# This code is contributed by mits  

