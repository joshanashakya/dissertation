n,m= map(int,input().split())a=[int(item) for item in input().split()]name_remains = 0for j in range(n):    print((name_remains+a[j])//m,end=" ")    name_remains = (name_remains+a[j]) % m
