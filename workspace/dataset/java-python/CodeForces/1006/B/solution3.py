I = lambda: map(int, input().split())INT = lambda: int(input()) ##T = INT()T = 1for _ in range(T):     n, k = I()     a = list(I())     a = sorted([(a[i], i) for i in range(n)], reverse=True)[:k]     print(sum([v for v, i in a]))     a = sorted([i for v, i in a])     a[-1] = n - 1     print(" ".join(str(y - x) for x, y in zip([-1] + a, a)))