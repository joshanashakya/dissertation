n = int(input())
x = list(map(int, input().split()))
arr = []
for i in range(n):
    arr.append((x[i], i))
arr.sort(key=lambda arr: arr[0])
ans = [-1] * n
maxx = 0
for i in range(n):
    maxx = max(maxx, arr[i][1])
    ans[arr[i][1]] = maxx - arr[i][1] - 1
for i in ans:
    print(i, end=' ')
