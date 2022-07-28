t = int(input())
for i in range(t):    n = int(input())
l = list(map(int, input().split()))
x = max(l) * (n - 1)
total = sum(l)
val = total // (n - 1)
if (total <= x):
    print(x - total)    else:
    if
    (val * (n - 1) == total): print(0) else:            print((val + 1) * (n - 1) - total)
