n, m = map(int, input().split())ans = 1for _ in range(n):  a = list(map(int, input().split()))  ans = max(ans, min(a))print(ans)
