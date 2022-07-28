n = int(input())li = [[] for _ in range(n)]for i in range(1, n * n // 2 + 1):    li[(i - 1) % n] += [i, n * n - i + 1]for line in li:    print(*line)
