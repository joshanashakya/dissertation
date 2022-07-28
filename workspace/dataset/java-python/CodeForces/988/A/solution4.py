n, k = map(int, input().split())a = list(map(int, input().split()))s = list(set(a))if len(s) >= k:    print("YES")    for r in range(k):        print(a.index(s[r]) + 1, end=' ')else:    print("NO")
