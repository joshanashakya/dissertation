

# Python3 implementation of the approach  
  
# Function that returns true  
# if n is prime  
def isPrime(n) :  
      
    if (n <= 1) : 
        return False;  
  
    # Check from 2 to n  
    for i in range(2, n) :  
        if (n % i == 0) : 
            return False;  
          
    return True;  
  
# Function to find the count  
# of 0s and 1s at prime indices  
def countPrimePosition(arr) : 
  
    # To store the count of 0s and 1s  
    c0 = 0; c1 = 0;  
    n = len(arr);  
      
    for i in range(n) :  
      
        # If current 0 is at  
        # prime position  
        if (arr[i] == 0 and isPrime(i)) : 
            c0 += 1;  
      
        # If current 1 is at  
        # prime position  
        if (arr[i] == 1 and isPrime(i)) : 
            c1 += 1;  
              
    print("Number of 0s =", c0);  
    print("Number of 1s =", c1);  
          
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 1, 0, 1, 0, 1 ];  
    countPrimePosition(arr);  
  
# This code is contributed by AnkitRai01 

