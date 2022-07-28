n, L, a = map(int, input().split())prev, ans = 0, 0for _ in range(n):  t, l = map(int, input().split())  ans += (t - prev) // a  prev = t + lans += (L - prev) // aprint(ans)
