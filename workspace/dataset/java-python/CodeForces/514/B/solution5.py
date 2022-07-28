n, x0, y0 = map(int, input().split())s = set()for _ in range(n):    x, y = map(int, input().split())    if x == x0:        s.add(float('inf'))    else:        s.add((y - y0) / (x - x0))print(len(s))
