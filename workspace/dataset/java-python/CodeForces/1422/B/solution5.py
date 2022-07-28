for _ in range(int(input())):    n, m = map(int, input().split())
s = []
for x in range(n):        k = list(map(int, input().split()))
s.append(k)
ans = 0
for i in range(n):        for
j in range(m): b = []
b.append(s[i][j])
b.append(s[n - i - 1][j])
b.append(s[i][m - j - 1])
b.sort()
s[i][j] = s[n - i - 1][j] = s[i][m - j - 1] = b[1]
ans += int(b[1]) - int(b[0])
ans += int(b[-1]) - int(b[1])
print(ans)
