n=int(input())arr=list(map(int,input().split()));k=2*(10**5+1)dp=[0]*kfor i in range(n): for j in range(n):    if i!=j:dp[arr[i]+arr[j]]+=1print(max(dp)//2)
