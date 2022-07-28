n = int(input())
for i in range(n):    x, y, z = map(int, input().split())
c = 0
while x > 1 and x % 2 == 0:        c += 1
x = x // 2
while y > 1 and y % 2 == 0:        c += 1
y = y // 2
if (2 ** c) >= z:
    print("YES")    else:
    print("NO")
