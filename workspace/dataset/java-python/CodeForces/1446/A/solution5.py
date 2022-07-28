import mathfor

_ in range(int(input())): n, w = map(int, input().split())
l = list(map(int, input().split()))
f = 0
s = 0
t = []
for i in range(n):        if
l[i] >= math.ceil(w / 2) and l[i] <= w: t = [i + 1]
s = l[i]
break else:            s += l[i]
if s > w:
    s -= l[i]            else:
    t.append(i + 1)
if s >= math.ceil(w / 2):                    break
if s >= math.ceil(w / 2):        print(len(t))
print(*t) else:        print(-1)
