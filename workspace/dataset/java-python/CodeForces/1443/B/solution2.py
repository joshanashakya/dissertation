t = int(input())
for _ in range(t):  a, b = map(int, input().split())
s = input()
cnt = 10 ** 6
ans = 0
for i in range(len(s)):    if
s[i] == "0": cnt += 1 else:      ans += min(a, cnt * b)
cnt = 0
print(ans)
