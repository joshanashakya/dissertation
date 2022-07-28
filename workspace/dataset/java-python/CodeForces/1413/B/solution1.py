t = int(input())
d = dict()
ans = ''
for i in range(t):    n, m = map(int, input().split())
d.clear()
a = []
for i in range(n):        x = input().split()
a.append(x)
d[x[
    0]] = i  # print(d,x)    c = False    for j in range(m):        x = input().split()        if (not c) and (x[0] in d):            c = True            for y in x:                ans+=' '.join(a[d[y]])                ans += '\n'print(ans)
