t = int(input())
for _ in range(t):    n = int(input())
sum1 = 0
base = 1
ans = 0
while sum1 <= n:        sum1 += (base * (base + 1)) // 2
base = (base * 2) + 1
ans += 1
print(ans - 1)
