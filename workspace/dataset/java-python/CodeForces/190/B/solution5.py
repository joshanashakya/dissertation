from math import sqrtx1, y1, r1 = map(int, input().split())x2, y2, r2 = map(int, input().split()) d = sqrt((x1 - x2)**2 + (y1 - y2)**2)if d > r1 + r2:    print((d - (r1+r2))/2)elif d < abs(r1 - r2):    print((abs(r1 - r2) - d) / 2)else:    print(0)