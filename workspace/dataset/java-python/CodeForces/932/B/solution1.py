from sys import stdindef g(t):  t=str(t)  s=1  for i in range(len(t)):    if t[i]!="0":      s*=int(t[i])  return sdef main():  memo=[-1]*(10**6+1)  for i in range(10):    memo[i]=i  for i in range(10,10**6+1):    x=i    while x>9:      if memo[x]>0:        x=memo[x]      x=g(x)    memo[i]=x  cnt=[[0]*10 for i in range(10**6+1)]  for i in range(1,10**6+1):    cnt[i][memo[i]]+=1    for j in range(10):      cnt[i][j]+=cnt[i-1][j]  Q=int(input())  for _ in range(Q):    l,r,k=map(int,stdin.readline().split())    print(cnt[r][k]-cnt[l-1][k])main()