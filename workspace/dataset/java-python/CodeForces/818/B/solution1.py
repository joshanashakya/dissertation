n, m = map(int, input().split())a = list(map(int, input().split()))used = [0]*(n+1)ans = [0]*(n+1) for x, y in zip(a, a[1:]):    z = (y - x) % n or n    if ans[x] == 0 and used[z] or ans[x] != 0 and ans[x] != z:        print(-1)        exit()    used[z] = 1    ans[x] = z i = 1for j in range(1, n+1):    if ans[j] == 0:        while used[i]:            i += 1        ans[j] = i        i += 1 print(*ans[1:])
