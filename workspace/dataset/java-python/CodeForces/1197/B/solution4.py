n=int(input())a=list(map(int,input().split()))q=0for i in range(1,n-1):    if a[i]<a[i-1] and a[i]<a[i+1]:        q=1        print('NO')        breakif q==0:    print('YES')
