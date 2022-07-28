t = int(input())
for i in range(t):    q, d = list(map(int, input().split()))
s = str(d)
l = [0 for j in range(d * 10 - 1)]
for j in range(d * 10 - 1):        if
str(j + 1).count(s): l[j] = 1 else:            for k in range(0, j):                if
l[k]:
if str(j - k).count(s):                        l[j] = 1
break
m = list(map(int, input().split()))
for i in m:        if
i >= d * 10: print("YES") elif l[i - 1]: print("YES") else:            print("NO")
