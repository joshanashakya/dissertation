a = int(input())
b = list(map(int, input().split()))
maximum = 0
for i in range(a):    ahead = 0
behind = 0
for j in range(i, a - 1):        if
b[j + 1] <= b[j]: ahead += 1 else:            break
for k in range(i, 0, -1):        if
b[k - 1] <= b[k]: behind += 1 else:            break
if ahead + behind > maximum:        maximum = ahead + behindprint(maximum + 1)
