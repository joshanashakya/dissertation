from heapq import heappush, heappopk=list(map(int, input().split()))
t = list(map(int, input().split()))
ans = 0
n = int(input())
l = sorted(list(map(int, input().split())))
X = list(l)
for i in range(3):    for
j in range(n):
if j >= k[i] and X[j - k[i]] > X[j]:            X[j] += X[j - k[i]] - X[j]
X[j] += t[i]
for i in range(n):    ans = max(ans, X[i] - l[i])
print(ans)
