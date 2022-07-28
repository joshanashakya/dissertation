t = int(input())
for _ in range(t):    n, k = map(int, input().split())
l = list(map(int, input().split()))
p = 0
pre = -1
for i in range(n):        if
pre != l[i]: pre = l[i]
p += 1
if k == 1 and p > 1:
    print(-1)    else:
    cnt = 1
p -= k
while p > 0:            p -= (k - 1)
cnt += 1
print(cnt)
