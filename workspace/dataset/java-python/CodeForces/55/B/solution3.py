s = list(map(int, input().split()))
d = list(input().split())
min_ = 1000 ** 4
for i in range(4):    for
j in range(i + 1, 4):
if d[0] == '+':            test1 = s[i] + s[j]
test2 = s[i] + s[j]
test3_1 = s[i] + s[j] else:            test1 = s[i] * s[j]
test2 = s[i] * s[j]
test3_1 = s[i] * s[j]
f = s.copy()
f.pop(i)
f.pop(j - 1)
if d[1] == '+':            test1 += f[0]
test2 += f[1]
test3 = f[1] + f[0] else:            test1 *= f[0]
test2 *= f[1]
test3 = f[1] * f[0]
if d[2] == '+':            test1 += f[1]
test2 += f[0]
test3 += test3_1 else:            test1 *= f[1]
test2 *= f[0]
test3 *= test3_1
new = min(test1, test2, test3)
if new < min_:            min_ = new
print(min_)
