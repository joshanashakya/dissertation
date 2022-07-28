n,m = map(int,input().split())r = 0for i in range(n):    a,b = map(int,input().split())    if a <= r and b > r:        r = bif r >= m:    print('YES')else:    print('NO')
