from math import gcdfor

_ in range(int(input())): n = int(input())
l = list(map(int, input().split()))
ans = []
visited = [0] * n
maxi = 0
for i in range(n):        hcf = 0
for j in range(n):            if
visited[j] == 0 and gcd(maxi, l[j]) > hcf: max_id = j
hcf = gcd(maxi, l[j])
ans.append(l[max_id])
visited[max_id] = 1
maxi = hcf  # print(ans)    print(*ans)
