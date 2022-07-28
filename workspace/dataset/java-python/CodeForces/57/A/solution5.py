n, x1, y1, x2, y2 = map(int, input().split())
d = {} if x1 == 0:    d[(x1, y1)] = 1
if x1 == n:    d[(x1, y1)] = -1
if x2 == 0:    d[(x2, y2)] = 1
if x2 == n:    d[(x2, y2)] = -1
if y1 == 0:    d[(x1, y1)] = 2
if y1 == n:    d[(x1, y1)] = -2
if y2 == 0:    d[(x2, y2)] = 2
if y2 == n:    d[(x2, y2)] = -2 if abs(abs(d[(x1, y1)]) - abs(d[(x2, y2)])) == 1:
    print(min(4 * n - (abs(x1 - x2) + abs(y1 - y2)), (abs(x1 - x2) + abs(y1 - y2))))elif (x1 == 0 and x2 == n) or (
        x1 == n and x2 == 0):
    print(min(4 * n - (y1 + y2 + n), y1 + y2 + n))elif (y1 == 0 and y2 == n) or (y1 == n and y2 == 0):
    print(min(4 * n - (x1 + x2 + n), x1 + x2 + n))elif (x1 == 0 and x2 == 0) or (x1 == n and x2 == n):
    print(abs(y2 - y1))elif (y1 == 0 and y2 == 0) or (y1 == n and y2 == n):
    print(abs(x2 - x1))
