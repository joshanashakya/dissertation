t = int(input())
for i in range(t):    x, y, k = map(int, input().split())
need = int(k * y)
if x == 2:
    print(need + k - 1 + k)    else:
    rem = (need + k - 1) % (x - 1)
count = (need + k - 1) // (x - 1)
if rem != 0:
    print(count + k + 1)        else:
    print(int(count) + k)
