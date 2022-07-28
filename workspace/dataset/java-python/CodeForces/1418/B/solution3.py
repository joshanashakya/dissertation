t = int(input())
for q in range(t):    n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
m = []
for i, j in enumerate(b):        if
j == 0: m.append(a[i])
m = sorted(m)[::-1]
z = 0
for i, j in enumerate(b):        if
j == 0: a[i] = m[z]
z += 1
for i in a:        print(i, end=' ')
print('')
