n = int(input())a = list(map(int, input().split()))ans = 0mx = 0for i in range(n):  mx = max(a[i], mx)  if mx == i + 1:    ans += 1print(ans)
