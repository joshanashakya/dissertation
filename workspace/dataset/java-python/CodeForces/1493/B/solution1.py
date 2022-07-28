def check(curr):    ones, tens = curr % 10, curr // 10


if ones in d and tens in d:        return d[ones] * 10 + d[tens]
return 10 ** 5
d = {1: 1, 2: 5, 5: 2, 8: 8, 0: 0}
for _ in range(int(input())):    h, m = map(int, input().split())
x, y = map(int, input().split(":"))
while True:        if
check(x) < m and check(y) < h:
break
y += 1
if y == m:            y = 0
x = (x + 1) % h
print(str(x).rjust(2, "0") + ":" + str(y).rjust(2, "0"))
