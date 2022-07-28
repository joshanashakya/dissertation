

# Python3 program to find (a^b) % MOD  
# where a and b may be very large  
# and represented as strings. 
MOD = 1000000007; 
  
# Returns modulo exponentiation  
# for two numbers represented as 
# long long int. It is used by 
# powerStrings(). Its complexity  
# is log(n) 
def powerLL(x, n): 
  
    result = 1; 
    while (n):  
        if (n & 1): 
            result = result * x % MOD; 
        n = int(n / 2); 
        x = x * x % MOD; 
    return result; 
  
# Returns modulo exponentiation  
# for two numbers represented as  
# strings. It is used by powerStrings() 
def powerStrings(sa, sb): 
      
    # We convert strings to number  
    a = 0; 
    b = 0; 
  
    # calculating a % MOD 
    for i in range(len(sa)): 
        a = (a * 10 + (ord(sa[i]) - 
                       ord('0'))) % MOD; 
  
    # calculating b % (MOD - 1) 
    for i in range(len(sb)): 
        b = (b * 10 + (ord(sb[i]) - 
                       ord('0'))) % (MOD - 1); 
  
    # Now a and b are long long int.  
    # We calculate a^b using modulo  
    # exponentiation 
    return powerLL(a, b); 
  
# Driver code 
  
# As numbers are very large 
# that is it may contains upto 
# 10^6 digits. So, we use string. 
sa = "2"; 
sb = "3"; 
  
print(powerStrings(sa, sb)); 
      
# This code is contributed by mits 

