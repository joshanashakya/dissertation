from math import ceil for t in range(int(input())):    A, B, n = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
damage = 0
for i in range(n):        damage = damage + ceil(b[i] / A) * a[i]
health = [0] * n
for i in range(n):        health[i] = B - damage + a[i]
if max(health) > 0:
    print('YES')    else:
    print('NO')
