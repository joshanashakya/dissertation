from math import *l, r, x, y = map(int, input().split())m = int(sqrt(y) -0.1) +1s = list(i for i in range(1, m) if y%i == 0)s += list(y//i for i in s)if m*m == y:    s += [m]print(sum(sum(int(l <= i <= r and l <= j <= r and i*j == x*y and gcd(i, j) == x) for i in s) for j in s))
