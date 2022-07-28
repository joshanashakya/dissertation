n = int(input())l = 1r = 1000000a = list(map(int, input().split()))ans = 0for i in range(n):    if a[i] - l <= r-a[i]:        ans = a[i] - 1    else:        ans = max(ans, r - a[i])print(ans)
