import matht = int(input())
for i in range(0, t):    n = int(input())
a = []
b = []
sum = 0
temp = 0
for i in range(0, 2 * n):        x, y = map(int, input().split())
if x == 0:
    a.append(abs(y))        else:
    b.append(abs(x))
a.sort()
b.sort()
for i in range(0, n):        x = a[i] * a[i]
y = b[i] * b[i]
temp = math.sqrt(x + y)
sum += temp
print(sum)
