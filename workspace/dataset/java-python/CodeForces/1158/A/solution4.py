import sysinput = sys.stdin.readline n, m = map(int, input().split())b = list(map(int, input().split()))g = list(map(int, input().split()))b.sort()g.sort() if b[-1]>g[0]:    print(-1)    exit() if b[-1]==g[0]:    ans = 0        for i in range(n-1):        ans += b[i]*m        ans += sum(g)        print(ans)else:    ans = 0        for i in range(n-2):        ans += b[i]*m        ans += g[0]+b[n-2]*(m-1)    ans += b[-1]+sum(g[1:])     print(ans)
