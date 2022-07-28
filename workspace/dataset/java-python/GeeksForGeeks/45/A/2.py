

# Python3 implementation of the approach  
  
# Function to return the highest  
# power of p that divides n  
def countFactors(n, p) :  
  
    pwr = 0;  
      
    while (n > 0 and n % p == 0) : 
        n //= p;  
        pwr += 1;  
          
    return pwr;  
  
# Function to return the count of times p  
# appaers in the prime factors of the  
# elements from the range [l, r]  
def getCount(l, r, p) :  
  
    # To store the required count  
    cnt = 0;  
  
    # For every element of the range  
    for i in range(l, r + 1) : 
  
        # Add the highest power of  
        # p that divides i  
        cnt += countFactors(i, p);  
  
    return cnt;  
  
# Driver code  
if __name__ == "__main__" :  
  
    l = 2; r = 8; p = 2;  
  
    print(getCount(l, r, p));  
  
# This code is contributed by AnkitRai01 

