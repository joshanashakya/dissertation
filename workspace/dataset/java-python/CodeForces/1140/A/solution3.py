import sys n = int(input())a = [int(i) for i in input().split()]ans = 0mx = 0for i in range(n):    mx = max(mx, a[i])    if mx == i + 1:        ans += 1print(ans)
