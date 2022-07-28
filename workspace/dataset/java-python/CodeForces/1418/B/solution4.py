t = int(input())
for i in range(0, t):    n = int(input())
a = list(map(int, input().split(" ")))
b = list(map(int, input().split(" ")))
l = []
for i in range(0, len(a)):        if
b[i] == 0: l.append(a[i])
if not l:
    print(*a)    else:
    j = 0
l.sort(reverse=True)
for i in range(0, len(a)):            if
b[i] == 0: a[i] = l[j]
j += 1
print(*a)
