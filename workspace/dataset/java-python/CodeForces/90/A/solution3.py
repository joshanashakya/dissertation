from math import ceilr, g, b=map(int, input().split())
r1 = 30 + (ceil(r / 2) - 1) * 3
g1 = (ceil(g / 2) - 1) * 3 + 1 + 30
b1 = (ceil(b / 2) - 1) * 3 + 2 + 30
print(max(r1, g1, b1))
