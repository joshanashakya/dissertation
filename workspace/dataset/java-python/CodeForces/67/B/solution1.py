n, k = map(int, input().split())
b = list(map(int, input().split())) taken = [False for i in range(n + 2)]
a = [] for i in range(n):    has = -1
for j in range(1, n + 1):        if
not taken[j] and b[j - 1] == 0: has = j
break
a.append(has)
taken[has] = True
for j in range(1, has - k + 1):        b[j - 1] -= 1 print(*a)
