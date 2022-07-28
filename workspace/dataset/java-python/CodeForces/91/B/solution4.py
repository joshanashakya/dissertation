n = int(input())
arr = [int(X) for X in input().split()]
temp = []
for i in range(n):
    temp.append([arr[i], i])
temp.sort()
maxi = 0
ans = [0 for i in range(n)]
for i in range(n):
    maxi = max(maxi, temp[i][1])
    ans[temp[i][1]] = maxi - temp[i][1] - 1
for i in ans:
    print(i, end=' ')
