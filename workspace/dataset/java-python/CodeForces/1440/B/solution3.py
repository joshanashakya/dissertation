for _ in range(int(input())):    n, k = map(int, input().split())
lr = list(map(int, input().split()))
lr.sort()
s = (n) // 2
l = lr[::-1]
ans = 0
idx = s
s += 1
for i in range(k):        ans += l[idx]
idx += s
print(ans)
