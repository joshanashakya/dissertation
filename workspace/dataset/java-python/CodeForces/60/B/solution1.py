(k, n, m) = map(int, input().split())
a = []
for i in range(k):    s = input()
a.append([])
for j in range(n):        a[-1].append(list(input()))
s = input()(x, y) = map(int, input().split())
x -= 1
y -= 1 start = (0, x, y)
sosed = set()
sosed.add(start)
posetil = set()
posetil.add(start)
while len(sosed) > 0:    sosed2 = set()
for i in sosed:        for
dk in [-1, 0, 1]:
for dx in [-1, 0, 1]:                for
dy in [-1, 0, 1]:
if abs(dk) + abs(dx) + abs(dy) == 1:                        if
(i[0] + dk < k) and (i[0] + dk >= 0) and (i[1] + dx < n) and (i[1] + dx >= 0) and (i[2] + dy < m) and (i[2] + dy >= 0):
if a[i[0] + dk][i[1] + dx][i[2] + dy] == '.':                                if
(i[0] + dk, i[1] + dx, i[2] + dy) in posetil:
continue else:                                    posetil.add((i[0] + dk, i[1] + dx, i[2] + dy))
sosed2.add((i[0] + dk, i[1] + dx, i[2] + dy))
sosed = sosed2.copy()
print(len(posetil))
