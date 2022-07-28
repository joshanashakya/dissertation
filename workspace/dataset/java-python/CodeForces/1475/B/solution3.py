t = int(input())
for i in range(t):    z = int(input())
c = 0
for j in range(z // 2020 + 1):            if
(z - 2020 * j) % 2021 == 0: c = 1
if c == 1:
    print('YES')    else:
    print('NO')
