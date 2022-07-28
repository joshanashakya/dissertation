n,k=map(int,input().split())r=[0]*kfor _ in range(n):  t=int(input())  r[t-1]+=1ans=0for i in range(k):  ans+=r[i]%2ans//=2print(n-ans)
