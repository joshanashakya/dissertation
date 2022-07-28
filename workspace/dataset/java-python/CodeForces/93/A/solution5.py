n, m, a, b = map(int, input().split())
a -= 1
x, y = a % m, b % m
d = b // m - a // m
if b == n and y: d += 1
u, v = x == 0, y == 0 or b == n
print(1 if u and v or d <= v else 2 if x == y or u or v or d == 1 else 3)
