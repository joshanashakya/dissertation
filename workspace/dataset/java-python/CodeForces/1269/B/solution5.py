 def solve(a, b, m):    n = len(a)    a.sort()    b.sort()    best = None    for d in range(n):        x = (b[0] - a[d]) % m        if (best is None or best > x) and all((a[(d + i) % n] + x) % m == b[i] for i in range(n)):            best = x    return best  n, m = map(int, input().split())a = list(map(int, input().split()))b = list(map(int, input().split()))print(solve(a, b, m))