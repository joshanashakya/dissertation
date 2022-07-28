t = int(input())
for i in range(t):    n, K = map(int, input().split())
arr = list(map(int, input().split()))
if n == 1:        print(-1)
continue
ans = 0
for j in range(K):        k = 0
while k < n - 1:            if
arr[k] < arr[k + 1]: arr[k] += 1
ans = k
break
k += 1
if k == n - 1:            print(-1)
break
if k != n - 1:        print(ans + 1) 
