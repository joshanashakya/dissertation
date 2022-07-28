n, x = map(int, input().split())ans = 0prev = 0for _ in range(n):  l, r = map(int, input().split())  ans += r - l + 1 + (l - prev - 1) % x  prev = rprint(ans)
