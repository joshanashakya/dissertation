n, k = input().split()
lis = input().split()
lis1 = lis[1:]
count = dict()
for i in lis1:    count[int(i)] = count.get(int(i), 0) + 1
ans = 0
prev = 0
for i in range(int(n) + 1):    if
count.get(i, 0) > 0: ans += 1
prev = i elif (i - prev) >= int(k): prev = i
ans += 1
print(ans)
