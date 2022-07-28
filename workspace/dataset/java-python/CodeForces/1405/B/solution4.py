t = int(input())
for _ in range(t):    n = int(input())
a = [int(s) for s in input().split(" ")]
ans = 0
for x in a:        ans = max(0, ans + x)
print(ans)
