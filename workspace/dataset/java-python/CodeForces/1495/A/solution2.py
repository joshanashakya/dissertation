for testis in range(int(input())):    n = int(input())
x, y = [], []
for i in range(2 * n):        xi, yi = map(int, input().split())
if xi:
    x.append(xi ** 2)        else:
    y.append(yi ** 2)
x.sort()
y.sort()
ans = 0
for i in range(n):        ans += (x[i] + y[i]) ** (0.5)
print(ans)
