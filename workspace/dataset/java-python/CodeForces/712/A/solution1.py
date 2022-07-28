n=int(input())a=[int(x) for x in input().split()]l=[]for i in range(1,n):    l.append(a[i]+a[i-1])l.append(a[n-1])    print(*l)    
