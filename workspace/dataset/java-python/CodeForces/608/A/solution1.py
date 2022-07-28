n, s = map(int, input().split())ans = sfor _ in range(n):  f, t = map(int, input().split())  ans = max(ans, f + t)print(ans)   
