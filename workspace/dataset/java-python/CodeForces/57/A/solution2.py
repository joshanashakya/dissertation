n, x, y, p, q = map(int, input().split(' '))
if ((x == p and (p == 0 or p == n)) or (y == q and (q == 0 or q == n)) or x == q or y == p or (x == 0 and q == n) or (
        y == 0 and p == n) or (q == 0 and x == n) or (p == 0 and y == n)):
    print(abs(x - p) + abs(y - q))else:
    if
    (abs(x - p) == n): print(n + min(y + q, 2 * n - y - q)) else:        print(n + min(x + p, 2 * n - x - p))
