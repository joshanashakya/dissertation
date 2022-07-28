n = int(input())ans, p, s = 0, 0, 0for i in range(n):    t, c = map(int, input().split())    s -= min(s, t - p)    p = t    s += c    if s > ans: ans = sprint(p + s, ans)
