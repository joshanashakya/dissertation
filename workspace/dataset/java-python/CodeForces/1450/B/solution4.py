def solve():    n, k = map(int, input().split())


p = [None] * n
for i in range(n):        a, b = map(int, input().split())
p[i] = (a, b)
for i in range(n):        for
j in range(n):
if abs(p[i][0] - p[j][0]) + abs(p[i][1] - p[j][1]) > k:
    break        else:
    print(1)
return print(-1) for _ in range(int(input())):    solve()
