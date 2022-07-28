f = lambda: map(int, input().split())n, m = f()t = list(f())s = [0] * 301d = s[:]for i in t: d[i] += 1for i in t * min(m, 2 * n): s[i] = max(s[:i + 1]) + 1print(max(s) + max((m - n * 2) * max(d), 0))
