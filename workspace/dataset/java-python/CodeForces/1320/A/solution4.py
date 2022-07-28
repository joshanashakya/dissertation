from math import *from sys import stdininput = stdin.readlinen, i = int(input()), 0d = {}for x in list(map(int, input().split())):    d[x - i] = d.get(x - i, 0) + x    i += 1print(max(d.values()))
