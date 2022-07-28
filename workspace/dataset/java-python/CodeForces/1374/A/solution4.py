for _ in range(int(input())):    x,y,n = map(int,input().split())    if (n - n % x + y) <= n:        res = n - n % x + y    else:        res = n - n % x - (x-y)    print(res) 
