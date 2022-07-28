n = int(input())now = 0for i in range(n):    s, d = map(int, input().split())    now = max(now + 1, s)    now = (now + d - 1 - s) // d * d + sprint(now)
