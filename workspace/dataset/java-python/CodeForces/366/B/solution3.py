_, k = map(int, input().split())v, s = map(int, input().split()), [0] * k for (i, x) in enumerate(v):  s[i % k] += x print(min([(x, i) for i, x in enumerate(s)])[1] + 1)
