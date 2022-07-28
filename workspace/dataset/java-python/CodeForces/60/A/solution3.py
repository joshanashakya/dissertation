v = [int(i) for i in input().split()]
n = v[0]
m = v[1] r = 1l = n ans = True for i in range(m):    hint = input().split()
vt = int(hint[-1])
if hint[2] == 'left':        if
    (vt - 1 < l): l = vt - 1 else:        if (vt + 1 > r):            r = vt + 1
if l < 0 or r > n:        ans = False
if l - r < 0:        ans = False if ans:
    print(l - r + 1)else:
    print(-1)
