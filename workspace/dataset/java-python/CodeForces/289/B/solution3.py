n,m,d=map(int,input().split())a=[0]for i in range(n):  a+=list(map(int,input().split()))a.sort()s=set()for i in range(1,len(a)):  s.add(a[i]%d)if len(s)>=2:  print(-1)  exit()aa=[0]*(n*m+1)for i in range(1,n*m+1):  aa[i]=aa[i-1]+a[i]ans=10**18for i in range(1,n*m+1):  ans=min(ans,(aa[-1]-2*aa[i]-(n*m-2*i)*a[i])//d)print(ans)
