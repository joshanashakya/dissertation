n, m = map(int, input().split())a = list(map(int, input().split()))current, ans = 0, 1for x in a:  if current + x <= m:    current += x  else:    current = x    ans += 1 print(ans)
