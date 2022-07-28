t = int(input())
ans = []
for i in range(t):    n = int(input())
s = input()
to = 0
ti = 0
for j in range(1, n):        if
s[j] == s[j - 1]:
if s[j] == "1":
    ti += 1            else:
    to += 1
ans.append(max(to, ti))
for k in ans:    print(k)
