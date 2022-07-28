for _ in range(int(input())):    n = int(input())    if n == 1:        print(-1)    else:        res = [3]*(n-1)        res.insert(0,2)        print(*res,sep='')
