for _ in range(int(input())):
    n = int(input())
    a = [int(x) for x in input().split()]
    ind, ce, ans = [0] * n, n, []
    for i in range(n): ind[n - a[i]] = i
    for i in ind:
        if i < ce:
            ans += a[i:ce]
            ce = i
    print(*ans)
