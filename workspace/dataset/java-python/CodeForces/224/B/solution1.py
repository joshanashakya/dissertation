n, k = map(int, input().split())a = [0] + list(map(int, input().split()))freq = [0] * (100001)dist = 0for i in range(1, n+1):    if freq[a[i]] == 0:        dist += 1    freq[a[i]] += 1l = 1 r = n if dist < k:    print(-1, -1)else:    while dist >= k and r >= l:        freq[a[r]] -= 1        if freq[a[r]] == 0:            dist -= 1        r -= 1    r += 1    dist += 1     while dist >= k and l <= r:        freq[a[l]] -= 1        if freq[a[l]] == 0:            dist -= 1        l += 1    l -= 1    print(l, r)