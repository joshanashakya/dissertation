from collections import defaultdict for t in range(int(input())):    n = int(input())
s = input()     d = "."
ok = True
result = 0
for i in range(
        n):  # print(i, result, ok, s[i], s[(i - 1)%n])        if s[i] == "-" or s[(i - 1)%n] == "-":            result += 1        if s[i] in (">", "<"):            if d == ".":                d = s[i]            elif d != s[i]:                ok = False     if ok:        print(n)    else:        print(result)
