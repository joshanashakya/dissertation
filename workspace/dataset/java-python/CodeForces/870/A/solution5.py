n, m = map(int, input().split())a = set(map(int, input().split()))b = set(map(int, input().split())) c = a&bif c: print(min(c))else:    x, y = min(a), min(b)    print(min(x, y)*10+max(x,y))
