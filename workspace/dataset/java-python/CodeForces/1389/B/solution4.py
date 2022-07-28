for _ in range(int(input())):
    n, k, z = map(int, input().split())
    arr = list(map(int, input().split()))
    pref = [0] * n
    pref[0] = arr[0]
    for i in range(1, n):
        pref[i] = pref[i - 1] + arr[i]

    ans = pref[k]
    for i in range(1, k):
        curr = 0
        neg = z
        x = k - i
        curr = pref[i]
        j = i
        f = -1
        while neg and x:
            if f == -1:
                j -= 1
                curr += arr[j]
                neg -= 1
                x -= 1
                f = 1
            elif f == 1:
                j += 1
                curr += arr[j]
                x -= 1
                f = -1
        if x:
            curr += (pref[j + x] - pref[j])
        ans = max(ans, curr)
    print(ans)
