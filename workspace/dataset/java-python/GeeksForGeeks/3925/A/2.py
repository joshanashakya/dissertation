

# Python3 Program to Paint N boxes using M  
# colors such that K boxes have color  
# different from color of box on its left  
  
M = 1001;  
MOD = 998244353;  
  
dp = [[-1]* M ] * M 
  
# This function returns the required number  
# of ways where idx is the current index and  
# diff is number of boxes having different  
# color from box on its left  
def solve(idx, diff, N, M, K) : 
      
    # Base Case  
    if (idx > N) :  
        if (diff == K) : 
            return 1 
        return 0
  
    # If already computed  
    if (dp[idx][ diff] != -1) : 
        return dp[idx];  
  
    # Either paint with same color as  
    # previous one  
    ans = solve(idx + 1, diff, N, M, K);  
  
    # Or paint with remaining (M - 1)  
    # colors  
    ans += (M - 1) * solve(idx + 1, diff + 1, N, M, K);  
  
    dp[idx][ diff] = ans % MOD;  
      
    return dp[idx][ diff] 
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 3
    M = 3
    K = 0 
  
    # Multiply M since first box can be  
    # painted with any of the M colors and  
    # start solving from 2nd box  
    print(M * solve(2, 0, N, M, K))  
  
# This code is contributed by Ryuga 

