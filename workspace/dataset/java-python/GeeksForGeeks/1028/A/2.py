

# Python3 implementation of the approach  
  
# Function to return the count  
# of prime factors of n  
def composite_factors(n) :  
  
    count = 0; 
      
    # Initialise array with 0 
    a = [0]*(n + 1) ; 
      
    for i in range(1, n + 1) :  
        if (n % i == 0) : 
  
            # Stored i value into an array  
            a[i] = i; 
  
    # Every non-zero value at a[i] denotes  
    # that i is a factor of n  
    for i in range(2,n + 1) : 
        j = 2;  
        p = 1;  
  
        # Find if i is prime  
        while (j < a[i]) : 
            if (a[i] % j == 0) : 
                p = 0;  
                break;  
                  
            j += 1;  
  
  
        # If i is a factor of n  
        # and i is not prime  
        if (p == 0 and a[i] != 0) : 
            count += 1;  
  
    return count;  
  
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 100;  
  
    print(composite_factors(n));  
      
# This code is contributed by AnkitRai01 

