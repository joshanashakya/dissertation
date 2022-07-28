xyzk = [int(i) for i in input().split()]
k = xyzk[3]
x, y, z = sorted([xyzk[0], xyzk[1], xyzk[2]])
x = min(k // 3 + 1, x)
y = min((k - x + 1) // 2 + 1, y)
z = min(k - x - y + 3, z)
print(x * y * z)
