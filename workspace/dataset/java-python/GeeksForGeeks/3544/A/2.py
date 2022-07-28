

# Python 3 program to count minimum  
# operations required to remove an array  
MAX = 100005
INT_MAX = 10000000
  
# Return the cost to convert two numbers  
# into consecutive prime number.  
def cost(a, b, prev, nxt): 
    sub = a + b 
    if (a <= b and prev[b - 1] >= a):  
        return nxt[b] + prev[b - 1] - a - b  
  
    a = max(a, b) 
    a = nxt[a]  
    b = nxt[a + 1]  
    return a + b - sub 
  
# Sieve to store next and previous  
# prime to a number.  
def sieve(prev, nxt):  
    pr = [0 for i in range(MAX)]  
  
    pr[1] = 1
    for i in range(1, MAX):  
        if (pr[i]):  
            continue
        for j in range(i * 2, MAX, i): 
            pr[j] = 1
  
    # Computing next prime each number. 
    for i in range(MAX - 2, -1, -1):  
        if (pr[i] == 0):  
            nxt[i] = i 
        else: 
            nxt[i] = nxt[i + 1] 
  
    # Computing previous prime each number. 
    for i in range(1, MAX):  
        if (pr[i] == 0):  
            prev[i] = i  
        else: 
            prev[i] = prev[i - 1]  
  
# Return the minimum number of  
# operation required.  
def minOperation(arr, nxt, prev, n):  
    dp = [[0 for i in range(n + 5)] 
             for i in range(n + 5)]  
  
    # For each index.  
    for r in range(n): 
          
        # Each subarray.  
        for l in range(r - 1, -1, -2):  
            dp[l][r] = INT_MAX;  
  
            for ad in range(l, r, 2):  
                dp[l][r] = min(dp[l][r], dp[l][ad] + 
                               dp[ad + 1][r - 1] + 
                               cost(arr[ad], arr[r], 
                                         prev, nxt)) 
    return dp[0][n - 1] + n // 2
  
# Driver Code 
arr = [1, 2, 4, 3]  
n = len(arr) 
  
nxt = [0 for i in range(MAX)] 
prev = [0 for i in range(MAX)]  
sieve(prev, nxt) 
print(minOperation(arr, nxt, prev, n)) 
  
# This code is contributed by sahishelangia 

