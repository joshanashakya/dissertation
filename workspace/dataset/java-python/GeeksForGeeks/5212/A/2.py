

# Python3 implementation of  
# the above approach  
from math import gcd 
  
# Function to return the LCM  
# of two numbers  
def lcm(a, b) : 
  
    GCD = gcd(a, b);  
    return (a * b) // GCD;  
  
# Function to return the minimum LCM  
# after removing a single element  
# from the given array  
def MinLCM(a, n) : 
  
    # Prefix and Suffix arrays  
    Prefix = [0] * (n + 2);  
    Suffix = [0] * (n + 2);  
  
    # Single state dynamic programming relation  
    # for storing LCM of first i elements  
    # from the left in Prefix[i]  
    Prefix[1] = a[0];  
    for i in range(2, n + 1) : 
        Prefix[i] = lcm(Prefix[i - 1],  
                             a[i - 1]);  
  
    # Initializing Suffix array  
    Suffix[n] = a[n - 1];  
  
    # Single state dynamic programming relation  
    # for storing LCM of all the elements having  
    # index greater than or equal to i in Suffix[i]  
    for i in range(n - 1, 0, -1) : 
        Suffix[i] = lcm(Suffix[i + 1], a[i - 1]);  
      
    # If first or last element of  
    # the array has to be removed  
    ans = min(Suffix[2], Prefix[n - 1]);  
  
    # If any other element is replaced  
    for i in range(2, n) : 
        ans = min(ans, lcm(Prefix[i - 1],  
                           Suffix[i + 1]));  
      
    # Return the minimum LCM  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 5, 15, 9, 36 ];  
    n = len(a);  
  
    print(MinLCM(a, n)); 
  
# This code is contributed by AnkitRai01 

