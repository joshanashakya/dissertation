n=int(input())a=list(map(int,input().split()))p=[0]*nfor i in range(n):    p[a[i]-1]=i+1s=0for i in range(n-1):    s+=abs(p[i]-p[i+1])print(s)
