

# Python3 program for the above approach  
  
# Function to calculate a^b mod m  
# using fast-exponentiation method  
def fastmod(base, exp, mod) : 
  
    if (exp == 0) :  
        return 1;  
          
    elif (exp % 2 == 0) : 
        ans = fastmod(base, exp / 2, mod);  
          
        return (ans % mod * ans % mod) % mod;  
      
    else : 
        return (fastmod(base, exp - 1, mod) 
                % mod * base % mod) % mod;  
  
# Function to  
# calculate sum  
def findPowerSum(n, ar) : 
      
    mod = int(1e9) + 7; 
    sum = 0; 
      
    # Itereate for all values of array A 
    for i in range(n) : 
        base = bin(ar[i]).count('1'); 
        exp = ar[i]; 
          
        # Calling fast-exponentiation and  
        # appending ans to sum 
        sum += fastmod(base, exp, mod); 
        sum %= mod; 
          
    return sum;  
  
# Driver code.  
if __name__ == "__main__" :  
  
    n = 3;  
    ar = [ 1, 2, 3 ];  
      
    print(findPowerSum(n, ar));  
  
# This code is contributed by AnkitRai01 

