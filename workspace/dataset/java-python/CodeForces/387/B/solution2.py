I=lambda:list(map(int,input().split()))n,m=I()a=I()b=I()i,j=0,0while i<n and j<m:    if a[i]<=b[j]:i+=1    j+=1print(n-i)
