n = int(input())a = list(map(int, input().split()))prev = 1ans = 0for x in a:  if x == 1:    if ans == 0 or prev == 1:      ans += 1    else:      ans += 2  prev = xprint(ans)
