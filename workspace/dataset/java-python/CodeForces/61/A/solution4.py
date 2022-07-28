a, b = input(), input()
c = [0] * len(a)
for i in range(len(a)):    if
a[i] != b[i]: c[i] = 1
print(*c, sep='')
