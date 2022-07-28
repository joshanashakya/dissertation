n = int(input())
a = list(map(int, input().split()))
tot = 0
cur = 1
for i in range(len(a) - 1):    if
    (a[i] == a[i + 1]): cur += 1 else:        tot += (cur * (cur + 1)) // 2
cur = 1
tot += (cur * (cur + 1)) // 2
print(tot)
