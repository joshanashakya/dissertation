import collectionsn = int(input())arr = list(map(int, input().split()))cs = collections.Counter(arr)ans = 0while cs:    ans += len(cs) - 1    for k in list(cs.keys()):        cs[k] -= 1        if not cs[k]:            del cs[k]print(ans)
