n,x=map(int,input().split())arr=list(map(int,input().split()))dp=[0]*(1<<18)ans=0#print(dp)for i in range(n):  a=x^arr[i]  ans+=dp[a]  dp[arr[i]]+=1print(ans)
