

# Python3 program to count total prime  
# number of set bits in given range 
def isPrime(n): 
  
    # Corner cases 
    if (n <= 1): return False; 
    if (n <= 3): return True; 
  
    # This is checked so that we can skip  
    # middle five numbers in below loop 
    if (n % 2 == 0 or n % 3 == 0): 
        return False; 
          
    i = 5; 
    while (i * i <= n): 
        if(n % i == 0 or n % (i + 2) == 0): 
            return False; 
        i = i + 6; 
  
    return True; 
  
# count number, that contains  
# prime number of set bit 
def primeBitsInRange(l, r): 
  
    # tot_bit store number of 
    # bit in number 
    count = 0; 
  
    # iterate loop from l to r 
    for i in range(l, r + 1): 
  
        # use predefined function for finding  
        # set bit it is return number of set bit 
        tot_bit = bin(i).count('1'); 
  
        # check tot_bit prime or, not 
        if (isPrime(tot_bit)): 
            count += 1; 
  
    return count; 
  
# Driver Code 
l = 6;  
r = 10;  
print(primeBitsInRange(l, r)); 
  
# This code is contributed by mits 

