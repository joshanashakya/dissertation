import sys input = sys.stdin.readline r, x, y, xx, yy = map(int, input().split()) dist = ((x-xx)**2 + (y-yy)**2)**0.5 ans = dist / (2*r) if ans % 1 == 0:    print(int(ans))else:    print(int(ans) + 1)           
