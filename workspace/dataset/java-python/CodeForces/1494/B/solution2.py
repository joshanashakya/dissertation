for _ in range(int(input())):    n, U, R, D, L = map(int, input().split())
ans = 'NO'
for a in range(2):        for
b in range(2):
for c in range(2):                for
d in range(2):
if 0 <= U - a - b <= n - 2 and 0 <= R - b - c <= n - 2 and 0 <= D - c - d <= n - 2 and 0 <= L - d - a <= n - 2:                        ans = 'YES'
print(ans)
