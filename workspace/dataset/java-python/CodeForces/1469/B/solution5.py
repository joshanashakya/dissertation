def solver(n, m, red, blue):    ans = 0


r = [0] * (n + 1)
b = [0] * (m + 1)
for i in range(n):        r[i + 1] += r[i] + red[i]
for i in range(m):        b[i + 1] += b[i] + blue[i]
ans = max(r) + max(b)
print(max(0, ans))
T = int(input())
for _ in range(T):    n = int(input())
red = [int(x) for x in input().split()]
m = int(input())
blue = [int(x) for x in input().split()]
solver(n, m, red, blue)
