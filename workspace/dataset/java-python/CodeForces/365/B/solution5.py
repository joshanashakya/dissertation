n = int(input())a = list(map(int, input().split()))ans = 0cnt = 2for i in range(2, n):    if a[i] == (a[i-1] + a[i-2]):        cnt += 1    else:        cnt = 2    ans = max(ans, cnt)if n <= 2:    ans = nprint(ans)     
