b = int(input())g = int(input())n = int(input())ans = 0for ib in range(b + 1):    rg = n - ib    if 0 <= rg <= g:        ans += 1print(ans)
