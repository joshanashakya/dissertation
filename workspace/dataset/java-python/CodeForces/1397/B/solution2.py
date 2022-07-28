n = int(input())
s = sorted(map(int, input().split()))
c = 1
mx = 100 * (10 ** 9)
ans = float('inf')
while c ** (n - 1) < mx:
    cur = 0
    for i in range(n): cur += abs(s[i] - c ** i)
    c += 1
    ans = min(ans, cur)
print(ans)
