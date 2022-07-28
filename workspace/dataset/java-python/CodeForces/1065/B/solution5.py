n,m = map(int,input().split())print(max(0,n-2*m),end=" ") k = 0while k*(k-1)//2<m:    k+=1print(n-k)
