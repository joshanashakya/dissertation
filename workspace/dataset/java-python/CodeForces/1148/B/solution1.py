from bisect import bisect_left n,m,ta,tb,k=map(int,input().split())a=[int(X)+ta for X in input().split()]b=[int(X) for X in input().split()]an=-1#&print(a,b)if k>=len(a) or k>=len(b):    print(-1)else:     for i in range(k+1):        xx=bisect_left(b,a[i])         if xx+k-i<m:            an=max(b[xx+k-i]+tb,an)        else:            an=-1            break     print(an)