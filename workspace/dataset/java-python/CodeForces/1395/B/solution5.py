n, m, s1, s2 = map(int, input().split())
g = -1
for i in range(s2, 0, -1):
    print(s1, i)
    k = 1
for i in range(s2 + 1, m + 1):
    print(s1, i)
    k = 0
h1 = s1 + 1
while (h1 <= n):
    if k == 0:
        for i in range(m, 0, -1):
            print(h1, i)
            g = i
        k = 1
        h1 += 1
    elif k == 1:
        for i in range(1, m + 1):
            print(h1, i)
            g = i
        k = 0
        h1 += 1
h2 = s1 - 1
if g == m:
    k = 0
else:
    k = 1
while (h2 > 0):
    if k == 0:
        for i in range(m, 0, -1):
            print(h2, i)
        k = 1
        h2 -= 1
    elif k == 1:
        for i in range(1, m + 1):
            print(h2, i)
        k = 0
        h2 -= 1
