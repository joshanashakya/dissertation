t = int(input())
for _ in range(t):    n = int(input())
s = input()
ans = 0
if "<" not in s or ">" not in s:
    ans = n    else:
    char = set()
i = 0
while True:            if
i == n:
break
i = i % n
if s[i] == "-":                char.add(i)
char.add((i + 1) % n)
i += 1
ans = len(char)
print(ans)
