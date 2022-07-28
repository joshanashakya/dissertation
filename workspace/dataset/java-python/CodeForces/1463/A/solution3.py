import sysinput = sys.stdin.readline t = int(input())
for _ in range(t):    a, b, c = map(int, input().split())
ans = "YES" if not (a + b + c) % 9 else "NO"
if min(a, b, c) < (a + b + c) // 9:        ans = "NO"
print(ans)
