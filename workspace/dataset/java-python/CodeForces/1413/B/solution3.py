from sys import stdininput = stdin.readline t = int(input())
for _ in range(t):    n, m = [int(x) for x in input().split()]
a = [[int(x) for x in input().split()] for _ in range(n)]
b = [[int(x) for x in input().split()] for _ in range(m)]
d = [0] * (n * m)
for y in range(n):        for
x in range(m): d[a[y][x] - 1] = y
ans = []
for i in b[0]:        ans.append(a[d[i - 1]])
for i in ans:        print(*i)
