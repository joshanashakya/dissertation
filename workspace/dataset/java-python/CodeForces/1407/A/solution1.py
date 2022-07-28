t = int(input())
for i in range(t):    n = int(input())
a = list(map(int, input().split()))
count0 = 0
count1 = 0
for i in range(n):        if
a[i] == 1: count1 += 1 else:            count0 += 1
if count1 <= n // 2:        res = [0] * (n - count1)
print(len(res))
print(*res) else:        if count1 % 2 != 0:
    res = [1] * (n - count0 - 1)        else:
    res = [1] * (n - count0)
print(len(res))
print(*res)
