import sysinput = sys.stdin.readlinefrom bisect import * n, U = map(int, input().split())E = list(map(int, input().split()))ans = -1 for i in range(n):    j = i+1    k = bisect_right(E, E[i]+U)-1        if k-i>=2:        ans = max(ans, (E[k]-E[j])/(E[k]-E[i])) print(ans)
