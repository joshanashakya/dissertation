t = int(input())
bit = 1 << 4
for _ in range(t):    n, u, r, d, l = map(int, input().split())
yes = False
for mask in range(bit):        ur = mask & 1
dr = (mask >> 1) & 1
dl = (mask >> 2) & 1
ul = (mask >> 3) & 1
u2 = u - ul - ur
r2 = r - ur - dr
d2 = d - dr - dl
l2 = l - dl - ul         if 0 <= min(u2, r2, d2, l2) and max(u2, r2, d2, l2) <= n - 2:            yes = True
break
if yes:
    print('YES')    else:
    print('NO') 
