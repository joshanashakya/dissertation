n, x = map(int, input().split())a = list(map(int, input().split()))ans = 0if x in a:  ans += 1for i in range(x):  if i not in a:    ans += 1print(ans)
