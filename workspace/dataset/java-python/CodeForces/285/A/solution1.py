n, k = map(int, input().split())print(*range(1, n - k), *range(n, n - 1 - k, -1))
