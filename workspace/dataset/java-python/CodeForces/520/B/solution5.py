n,m=map(int,input().split())q=0while n!=m:    m=[m//2,m+1][m&1 or m<n]    q+=1print(q)
