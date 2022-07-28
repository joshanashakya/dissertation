

# Python3 program to find the minimum number  
# of single digit prime numbers required   
# which when summed equals to a given   
# number N. 
  
# function to check if i-th  
# index is valid or not  
  
def check(i,val): 
    if i-val<0: 
        return False
    return True
  
# function to find the minimum number of single  
# digit prime numbers required which when summed up  
# equals to a given number N. 
  
def MinimumPrimes(n): 
    dp=[10**9]*(n+1) 
    dp[0]=dp[2]=dp[3]=dp[5]=dp[7]=1
    for i in range(1,n+1): 
        if check(i,2): 
            dp[i]=min(dp[i],1+dp[i-2]) 
        if check(i,3): 
            dp[i]=min(dp[i],1+dp[i-3]) 
        if check(i,5): 
            dp[i]=min(dp[i],1+dp[i-5]) 
        if check(i,7): 
            dp[i]=min(dp[i],1+dp[i-7]) 
  
    # Not possible 
    if dp[n]==10**9: 
        return -1
    else: 
        return dp[n] 
  
  
# Driver Code 
if __name__ == "__main__": 
    n=12
    minimal=MinimumPrimes(n) 
    if minimal!=-1: 
        print("Minimum number of single digit primes required : ",minimal) 
    else: 
        print("Not possible") 
#This code is contributed Saurabh Shukla 

