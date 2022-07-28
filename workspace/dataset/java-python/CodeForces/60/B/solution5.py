from collections import deque k, n, m = map(int, input().split())
input() allowed = set()
for i in range(k):    for
j in range(n):
for l, l_value in enumerate(input()):            if
l_value == '.': allowed.add((i, j, l))
input() count0 = len(allowed)    q = deque()
x0, y0 = map(int, input().split())
q.append((0, x0 - 1, y0 - 1))
allowed.remove(q[0]) dir = [(1, 0, 0), (-1, 0, 0), (0, 1, 0), (0, -1, 0), (0, 0, 1), (0, 0, -1)] while len(
    q):    x, y, z = q.popleft()
for dx, dy, dz in dir:        nt = x + dx, y + dy, z + dz
if nt in allowed:            q.append(nt)
allowed.discard(nt) if count0 == 0:
    print(0)else:
    print(count0 - len(allowed))
