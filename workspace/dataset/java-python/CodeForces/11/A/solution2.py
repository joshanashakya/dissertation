n, d = map(int, input().split())arr = [int(i) for i in input().split()]ans = 0for i in range(1, n):    if arr[i] <= arr[i - 1]:        l, r = 0, 10 ** 8        while (r - l) > 1:            mid = (r + l) // 2             k = mid * d             if (arr[i] + k) > arr[i - 1]:                r = mid            else:                l = mid                arr[i] += r * d        ans += r print(ans)
