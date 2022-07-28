

# Python3 implementation to Count the 
# numbers with N digits and whose 
# suffix is divisible by K 
  
mod = 1000000007
dp = [[[-1 for i in range(2)] for i in range(105)] for i in range(1005)] 
powers = [0]*1005
powersModk = [0]*1005
  
# Suffix of length pos with 
# remainder rem and Z representing 
# whether the suffix has a 
# non zero digit until now 
def calculate(pos, rem, z, k, n): 
    # Base case 
    if (rem == 0 and z): 
  
        # If count of digits 
        # is less than n 
        if (pos != n): 
  
            # Placing all possible 
            # digits in remaining 
            # positions 
            return (powers[n - pos -1] * 9) % mod 
        else: 
            return 1
  
    # If remainder non zero 
    # and suffix has n digits 
    if (pos == n): 
        return 0
  
    # If the subproblem 
    # is already solved 
    if (dp[pos][rem][z] != -1): 
        return dp[pos][rem][z] 
  
    count = 0
  
    # Placing all digits at MSB 
    # of suffix and increasing 
    # it's length by 1 
    for i in range(10): 
        if (i == 0): 
            count = (count + (calculate( 
            pos + 1, (rem + (i *
                powersModk[pos]) % k) %
                    k, z, k, n))) % mod 
  
        # Non zero digit is placed 
        else: 
            count = (count + (calculate( 
                pos + 1, (rem + (i *
                powersModk[pos]) % k) %
                k, 1, k, n))) % mod 
  
    # Store and return the 
    # solution to this subproblem 
    dp[pos][rem][z] = count 
    return count 
  
# Function to Count the numbers 
# with N digits and whose suffix 
# is divisible by K 
def countNumbers(n, k): 
  
    # Since we need powers of 10 
    # for counting, it's better to 
    # pre store them along with their 
    # modulo with 1e9 + 7 for counting 
    st = 1
    for i in range(n + 1): 
        powers[i] = st 
        st *= 10
        st %= mod 
  
    # Since at each recursive step 
    # we increase the suffix length by 1 
    # by placing digits at its leftmost 
    # position, we need powers of 10 
    # modded with k, in order to fpos 
    # the new remainder efficiently 
    st = 1
    for i in range(n + 1): 
        powersModk[i] = st 
        st *= 10
        st %= mod 
  
    # Initialising dp table values -1 
    # represents subproblem hasn't 
    # been solved yet 
    # memset(dp, -1, sizeof(dp)) 
  
    return calculate(0, 0, 0, k, n) 
  
# Driver Code 
if __name__ == '__main__': 
    N = 2
    K = 2
  
    print(countNumbers(N, K)) 
  
# This code is contributed by mohit kumar 29 

