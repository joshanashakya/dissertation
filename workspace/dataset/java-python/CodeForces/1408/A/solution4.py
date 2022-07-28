t = int(input())
for z in range(t):    n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))
l = [a[0]]
for i in range(1, n):        if
a[i] != l[len(l) - 1] and a[i] != l[0]: l.append(a[i]) elif b[i] != l[len(l) - 1] and b[i] != l[0]: l.append(
    b[i]) else:l.append(c[i])
print(*l)
