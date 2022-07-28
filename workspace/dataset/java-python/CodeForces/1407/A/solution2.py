for _ in range(int(input())):    n = int(input())
l = list(map(int, input().split()))
ans = []
cnt0 = cnt1 = 0
value = 0
for i in l:        if
i == 1: cnt1 += 1 else:            cnt0 += 1
if cnt0 >= n // 2:        value = cnt0
ans = [0] * (cnt0) else:        if cnt1 % 2 == 1:            value = cnt1 - 1
ans = [1] * (cnt1 - 1) else:            value = cnt1
ans = [1] * (cnt1)
print(value)
print(*ans)
