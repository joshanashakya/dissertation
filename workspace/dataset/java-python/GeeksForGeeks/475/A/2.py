

# Python3 program for the above approach  
  
# Function to check if n is prime  
def isPrime(n) :  
  
    for i in range(2, int(n ** (1/2)) + 1) : 
        if (n % i == 0) : 
            return False;  
      
    return True;  
  
# Function to count the minimum  
# prime required for given sum N  
def printMinCountPrime(N) :  
  
    # Case 1:  
    if (isPrime(N)) : 
        minCount = 1;  
  
    # Case 2:  
    elif (N % 2 == 0) : 
        minCount = 2;  
  
    # Case 3:  
    else :  
  
        # Case 3a:  
        if (isPrime(N - 2)) : 
            minCount = 2;  
  
        # Case 3b:  
        else : 
            minCount = 3;  
  
    print(minCount) ;  
  
# Driver Code  
if __name__ == "__main__" :  
    N = 100;  
  
    # Function Call  
    printMinCountPrime(N);  
  
# This code is contributed by AnkitRai01 

