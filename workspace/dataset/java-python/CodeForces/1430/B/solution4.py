t = int(input())
for j in range(t):    a, b = map(int, input().split(' '))
k = list(map(int, input('').split(' ')))
if k.count(0) == a:
    print(0)    else:
    k = sorted(k)
z = max(k)
for i in range(1, b + 1):            z += k[a - 1 - i]
print(z)
