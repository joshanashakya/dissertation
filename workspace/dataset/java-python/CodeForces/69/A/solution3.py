n = int(input())
x = 0
y = 0
z = 0
for i in range(n):    inp = list(map(int, input().split()))
x += inp[0]
y += inp[1]
z += inp[2]
if (x == 0 and y == 0 and z == 0):
    print("YES")else:
    print("NO")
