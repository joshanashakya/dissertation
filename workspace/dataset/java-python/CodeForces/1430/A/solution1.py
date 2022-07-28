for t in range(int(input())):    n = int(input())
if n in [1, 2, 4]:        print(-1)
continue
x = y = z = 0
z = n // 7
left = [[0, 0, 0], [1, 1, -1], [3, 0, -1], [1, 0, 0], [2, 1, -1], [0, 1, 0], [2, 0, 0]]
x += left[n % 7][0]
y += left[n % 7][1]
z += left[n % 7][2]
print(x, y, z)
