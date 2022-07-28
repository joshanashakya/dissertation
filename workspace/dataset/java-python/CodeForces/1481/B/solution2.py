t = int(input())
for _ in range(t):    a, b = [int(i) for i in input().split()]
c = [int(i) for i in input().split()]
ans = 0
flag = 0
for i in range(0, len(c) - 1):        if
    (c[i] >= c[i + 1]):
pass else:            flag = 1
if (flag == 0):
    print(-1)    else:
    for
j in range(b): s = 0
for k in range(0, len(c) - 1):                if
    (c[k] >= c[k + 1]): s += 1 else:                    c[k] += 1
ans = k + 1
break
if (s == a - 1):                break
if (j <= b - 1 and s == a - 1):
    print(-1)        else:
    print(ans)
