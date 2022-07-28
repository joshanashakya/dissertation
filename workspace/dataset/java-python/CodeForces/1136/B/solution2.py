n, k = map(int, input().split())ans = min(k - 1, n - k) * 2 + max(k - 1, n - k) + 2 * n + 1print(ans)
