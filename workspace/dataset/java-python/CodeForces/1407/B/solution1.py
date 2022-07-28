from math import gcdfor

_ in range(int(input())): n = int(input())
l = list(map(int, input().split()))
ans = []
visited = [0] * n
maxi = max(l)
id = l.index(maxi)
visited[id] = 1
ans.append(maxi)
k = 0
hcf = -1
while k < n - 2:        for
i in range(n):
if visited[i] == 0:                curr_hcf = gcd(l[i], maxi)
if curr_hcf > hcf:                    curr_id = i
hcf = curr_hcf
ans.append(l[curr_id])
visited[curr_id] = 1
maxi = hcf
k += 1
hcf = -1
for i in range(n):        if
visited[i] == 0: ans.append(l[i])
print(*ans)
