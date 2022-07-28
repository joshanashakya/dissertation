a = list(map(int, input().split()))s, ans = input(), 0for x in s:    ans += a[int(x)-1]print(ans)
