def solve(s, l, r):    lind, rind = s.find(s[l - 1]), s.rfind(s[r - 1])


if (lind != -1 and rind != -1):        if
    (rind - lind >= len(s[l - 1:r])):
return ("YES") else:            return ("NO") else:        return ("NO")
for i in range(int(input())):    n, q = map(int, input().split())
s = input()
for i in range(q):        l, r = map(int, input().split())
print(solve(s, l, r))
