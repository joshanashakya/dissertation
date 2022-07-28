t = int(input())
for _ in range(t):    a, b = map(int, input().split())
s = input()
id = 0
id1 = 0
ans = 0
m = float('inf')
for i in range(len(s)):        if
s[i] == '0': m += 1 else:            ans += min(a, b * m)
m = 0
print(ans)
