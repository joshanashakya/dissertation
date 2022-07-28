n,d=list(map(int,input().split()))a=list(map(int,input().split()))b=0for i in range(n):    for j in range(i+1,n):        if abs(a[i]-a[j])<=d:            b+=2print(b)
