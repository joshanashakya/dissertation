n=int(input())a=list(map(int,input().split()))if sum(a)%2:    print('NO')    exit()k=sum(a)for i in range(n):    if a[i]*2>k:        print('NO')        exit()print('YES')
