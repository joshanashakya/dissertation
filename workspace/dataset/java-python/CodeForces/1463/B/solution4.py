for _ in range(int(input())):    n = int(input())
l = list(map(int, input().split()))
sum_e = sum_o = 0
for i in range(n):        if
i % 2 == 0: sum_e += l[i] else:            sum_o += l[i]
if sum_e < sum_o:
    t = 1    else:
    t = 0
ans = []
for i in range(n):        if
i % 2 == t: ans.append(l[i]) else:            ans.append(1)             print(*ans)
