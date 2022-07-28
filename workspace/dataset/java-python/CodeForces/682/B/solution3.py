n=int(input())a=sorted([0]+[int(x)for x in input().split()])for i in range(1,n+1):    if a[i]!=a[i-1]:        a[i]=a[i-1]+1print(a[-1]+1)
