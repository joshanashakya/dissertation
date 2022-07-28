for _ in range(int(input())):    n, m = map(int, input().split())
s = sorted(list(map(int, input().split())), reverse=True)
p = list(map(int, input().split()))     ans = 0
for i in range(n):        if
i + 1 < s[i]: ans += p[i] else:            ans += p[s[i] - 1]
print(ans)
