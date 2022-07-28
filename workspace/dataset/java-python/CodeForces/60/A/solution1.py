[n, m] = map(int, (input().split()))
p1 = 0
p2 = n + 1
for j in range(m):    hint = input()
ind_val = int(hint.split()[-1])
if hint[7] == 'r':        if
p1 < ind_val: p1 = ind_val
if hint[7] == 'l':        if
p2 > ind_val: p2 = ind_val if p1 >= p2 - 1:
    print(-1)    else:
    print(p2 - p1 - 1)
