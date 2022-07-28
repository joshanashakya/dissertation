pt, s, vs = 0, 0, 0for i in range(int(input())):    t, c = map(int, input().split())    s = max(s - (t - pt), 0) + c    vs = max(vs, s)    pt = tprint(pt + s, vs)
