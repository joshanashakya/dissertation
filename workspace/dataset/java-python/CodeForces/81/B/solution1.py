a = input()
b = ''
c = 0
n = len(a)
d = 0
e = 0
for i in range(n):    if
a[i] == '.':
if c % 3 == 0 and i != 0 and (e == 0 or b[-1] != ' '):            b += ' '
e += 1
b += a[i]
e += 1
c += 1
d = 0 elif a[i] == ',': b += a[i]
e += 1
if i != n - 1:            b += ' '
e += 1
d = 0 elif a[i] != ' ':
if d == 2:            b += ' '
e += 1
b += a[i]
e += 1
d = 1 else:        if d == 1:            d = 2
print(b)
