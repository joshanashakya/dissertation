

# Check whether a number can be represented  
# by sum of two squares using Fermat Theorem.  
def judgeSquareSum(n):  
  
    i = 2; 
    while (i * i <= n):  
        count = 0;  
        if (n % i == 0):  
              
            # Count all the prime factors.  
            while (n % i == 0):  
                count += 1;  
                n = int(n / i);  
      
            # Ifany prime factor of the 
            # form (4k+3)(4k+3) occurs 
            # an odd number of times.  
            if (i % 4 == 3 and count % 2 != 0):  
                return False;  
        i += 1;  
      
    # If n itself is a x prime number and  
    # can be expressed in the form of 4k + 3  
    # we return false.  
    return n % 4 != 3;  
  
# Driver Code  
n = 17;  
if(judgeSquareSum(n)):  
    print("Yes");  
else: 
    print("No");  
      
# This code is contributed by mits 

