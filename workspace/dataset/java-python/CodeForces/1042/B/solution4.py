n=int(input())dp=[10**18]*8dp[0]=0for i in range(n):  c,s=input().split(" ")  s=list(s)  x=0  if "A" in s:    x+=1  if "B" in s:    x+=2  if "C" in s:    x+=4  c=int(c)  for i in range(8):    y=0    for j in range(3):      if (i>>j)&1==1 or (x>>j)&1==1:        y+=2**j    dp[y]=min(dp[i]+c,dp[y])if dp[7]==10**18:  print(-1)else:  print(dp[7])