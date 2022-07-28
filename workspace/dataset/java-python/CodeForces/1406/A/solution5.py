for _ in " " * int(input()):  n = int(input())
lst = sorted(list(map(int, input().split())))
a, b = 0, 0
for i in lst:    if
a == i: a += 1 elif b == i: b += 1
print(a + b)
