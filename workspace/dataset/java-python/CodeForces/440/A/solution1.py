n=int(input())d=n*(n+1)//2a=list(map(int,input().split()))s=0for i in range(0,n-1):    s+=a[i]print(int(d-s))
