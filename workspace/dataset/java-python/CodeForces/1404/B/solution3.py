from sys import stdin

for _ in range(int(input())):    n, a, b, da, db = map(int, input().split())
a -= 1
b -= 1
go = [[] for _ in range(n)]
for _ in range(n - 1):        x, y = map(int, stdin.readline().split())
x -= 1
y -= 1
go[x].append(y)
go[y].append(x)
MAX = 0


def f(pre, node, level):        global MAX, dis


re = [0, 0]
if node == b:            dis = level
for x in go[node]:            if
pre != x: re.append(f(node, x, level + 1))
re.sort()
MAX = max(MAX, re[-1] + re[-2])
return re[-1] + 1
f(-1, a, 0)
if dis <= da or da * 2 >= db or da * 2 >= MAX:
    print('Alice')    else:
    print('Bob')
