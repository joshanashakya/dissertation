t = int(input())
res = [] for i in range(0, t):    n, d = (int(x) for x in input().strip().split(' '))
a1 = [int(x) for x in input().strip().split(' ')]     a = sorted(a1)
if a[n - 1] <= d:
    res.append("YES")    else:
    if
a[1] + a[0] <= d: res.append("YES") else:            res.append("NO")
a.clear()
for i in range(0, t):    print(res[i]) res.clear() 
