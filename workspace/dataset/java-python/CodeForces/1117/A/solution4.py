n = int(input())a = [*map(int, input().split())] mx = max(a)ans = 1i = 0 while i < n:    count = 0    while i < n and a[i] == mx:        count += 1        i += 1     i += 1    ans = max(ans, count) print(ans)
