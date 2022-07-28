y,k,n=map(int,input().split())c = int(y // k) + 1if y>=n or c*k not in range(y,n+1):    print(-1)else:    c=int(y//k)+1    arr=[x-y for x in range(c*k,n+1,k)]    print(*arr)
