import sysimport math t = int(sys.stdin.readline())for _ in range(t):    n = int(sys.stdin.readline())    l = [0] + list(map(int, sys.stdin.readline().split()))    ans = [1 for i in range(n+1)]    for i in range(1, n+1):        for j in range(1, round(math.sqrt(i))+1):            if i % j == 0:                if j != i and l[i] > l[j]:                    ans[i] = max(ans[j]+1, ans[i])                if i//j != i and l[i] > l[i//j]:                    ans[i] = max(ans[i//j]+1, ans[i])    best = 0    for i in range(1, n+1):        best = max(best, ans[i])    print(best)    #print(l)    #print(ans)
