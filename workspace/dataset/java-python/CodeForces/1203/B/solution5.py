for _ in range(int(input())):    n=int(input())    count=0    a = list(map(int, input().split()))    a.sort()    f=0    p = a[0] * a[4 * n - 1]    for i in range(0,4*n,2):        if a[i]*a[4*n-1-i]  !=  p or a[i]  != a[i+1]:            f=1     if f==0:        print("YES")    else:        print("NO")
