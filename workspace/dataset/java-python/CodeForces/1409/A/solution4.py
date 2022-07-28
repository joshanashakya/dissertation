from math import ceilt=int(input())
for i in range(t):    a, b = map(int, input().split())
print(ceil((abs(a - b) / 10)))
