I = lambda: map(int, input().split())INT = lambda: int(input()) ##T = INT()T = 1for _ in range(T):##     n = INT()     n, a, b = I()     s = a + b     print(s % n + n*(s % n == 0))     
