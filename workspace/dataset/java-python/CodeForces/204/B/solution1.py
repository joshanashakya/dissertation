from collections import defaultdictn = int(input())u, v = defaultdict(int), defaultdict(int)for k in range(n):    a, b = map(int, input().split())    u[a] += 1    if b != a: v[b] += 1k = (n - 1) // 2s = any(v[b] > k for b in v)t = [u[a] for a in u if u[a] + v[a] > k]if t: print(max(0, k + 1 - max(t)))else: print(k + 1 if s else -1)