

# Python 3 program to find product of all  
# Subsequences of size K except the  
# minimum and maximum Elements 
  
MOD = 1000000007
  
max = 101
  
# 2D array to store value of  
# combinations nCr 
C = [[0 for i in range(max)] for j in range(max)] 
  
def power(x,y): 
    res = 1
    x = x % MOD 
    while (y > 0): 
        if (y & 1): 
            res = (res * x) % MOD 
  
        y = y >> 1
        x = (x * x) % MOD 
  
    return res % MOD 
  
# Function to pre-calculate value of all  
# combinations nCr 
def combi(n, k): 
    for i in range(n + 1): 
        for j in range(min(i, k) + 1): 
            if (j == 0 or j == i): 
                C[i][j] = 1
            else: 
                C[i][j] = (C[i - 1][j - 1] % MOD + 
                            C[i - 1][j] % MOD) % MOD 
  
# Function to calculate product of all subsequences  
# except the minimum and maximum elements 
def product(a, n, k): 
    ans = 1
  
    # Sorting array so that it becomes easy  
    # to calculate the number of times an  
    # element will come in first or last place 
    a.sort(reverse = False) 
      
    # An element will occur 'powa' times in total 
    # of which 'powla' times it will be last element 
    # and 'powfa' times it will be first element 
    powa = C[n - 1][k - 1] 
  
    for i in range(n): 
        powla = C[i][k - 1] 
        powfa = C[n - i - 1][k - 1] 
          
        # In total it will come  
        # powe = powa-powla-powfa times 
        powe = ((powa % MOD) - (powla + powfa) % MOD + MOD) % MOD 
          
        # Multiplying a[i] powe times using  
        # Fermat Little Theorem under MODulo  
        # MOD for fast exponentiation 
        mul = power(a[i], powe) % MOD 
        ans = ((ans % MOD) * (mul % MOD)) % MOD 
      
    return ans % MOD 
  
# Driver Code 
if __name__ == '__main__': 
    # pre-calculation of all combinations 
    combi(100, 100) 
  
    arr = [1, 2, 3, 4] 
    n = len(arr) 
    k = 3
  
    ans = product(arr, n, k) 
    print(ans) 
  
# This code is contributed by 
# Surendra_Gangwar 

