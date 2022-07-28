a, b, c = (int(x) for x in input().split())r = 0for x in range(c):    r += (((a - x*4) + (b - x*4) - 2) * 2)print(r)
