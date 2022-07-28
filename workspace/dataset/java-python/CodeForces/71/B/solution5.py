from math import floor n, k, t = map(int, input().split())
bar = [k for _ in range(0, n * t // 100)]
if t != 100:    bar.append(floor((n * k * t / 100) - sum(bar)))
bar += [0 for _ in range(n * t // 100 + 1, n)]
print(*bar)
