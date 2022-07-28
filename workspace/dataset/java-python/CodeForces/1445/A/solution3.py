I, q = lambda: map(int, input().split()), int(input())
for j in range(q):    n, x = I();a, b, t = sorted(I()), sorted(I(), reverse=1), 1
for i in range(n):        if
a[i] + b[i] > x: t = 0
print(["NO", "YES"][t])
if j < q - 1: input()
